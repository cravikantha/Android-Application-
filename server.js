const express = require('express');
const bodyParser = require('body-parser');
const cors = require('cors');
const sgMail = require('@sendgrid/mail');

const app = express();
const PORT = 3000;

// Set SendGrid API key
sgMail.setApiKey('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');

// Middleware
app.use(cors());
app.use(bodyParser.json());

// Email sending endpoint
app.post('/send-email', async (req, res) => {
    const { email, subject, body } = req.body;

    const msg = {
        to: email,
        from: 'sandalianuththara2007@gmail.com', // Replace with your email
        subject: subject,
        text: body,
    };

    try {
        await sgMail.send(msg);
        res.status(200).send('Email sent successfully!');
    } catch (error) {
        console.error('Error sending email:', error);
        
        // Send a detailed error message
        if (error.response) {
            // SendGrid specific error response
            res.status(500).send(`Failed to send email. Error: ${error.response.body.errors[0].message}`);
        } else {
            // Generic error response
            res.status(500).send('Failed to send email. An unknown error occurred.');
        }
    }
});

app.listen(PORT, () => {
    console.log(`Server running on http://localhost:${PORT}`);
});
