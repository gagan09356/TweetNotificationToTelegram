Modification required in TweetToTelegramApp.java

add your Twitter API key API Secert key access token access token secert
telegram bot id and chat id

**How to create tweet developer application::**

Step 1: Create a Twitter Developer Account
Go to Twitter Developer Portal: Visit the Twitter Developer website.

Sign In: If you don’t have a Twitter account, sign up for one. If you already have one, simply log in.

Apply for a Developer Account:

Click on Apply for a Twitter Developer account.
You’ll need to provide details about why you want access to Twitter’s API, and your intended use of it.
Twitter may ask questions about the type of data you plan to access and your usage. Be honest and detailed in your explanation to avoid rejections.
Approval Process: Twitter will review your application, and you will receive an email notification when your developer account is approved.

Step 2: Create a Twitter App
Go to Developer Dashboard: After your developer account is approved, log into the Twitter Developer Dashboard.

Create a New Project & App:

Click on Create a new project.
Fill in details such as:
Project Name: A name for your project (e.g., TweetToTelegram).
Use Case: Choose a category based on your project type.
App Environment: Typically, "Development" for personal projects.
Create an App:

After creating the project, Twitter will prompt you to create an App within the project.
Enter the App Name.
Choose a description, website URL (if available), and agree to the terms and conditions.
Click Create.
Step 3: Generate API Keys & Tokens
Access App Details: Once your app is created, go to the Keys and Tokens tab in the app’s dashboard.

API Key and Secret:

Click on the Generate button next to API Key & Secret to generate your API key and secret key.
Copy and save these credentials somewhere secure as you will need them to authenticate API requests.
Bearer Token:

Scroll down and click Generate under Bearer Token.
This token is used for certain API operations and authentication.
Access Token and Secret:

Below the API Key & Secret, click Generate under Access Token & Secret.
This will allow you to make authorized requests on behalf of your account.
Copy and store both the Access Token and Access Token Secret as you'll need them for authenticated requests.
Step 4: Enable API Access Permissions
Permissions:

Under the Permissions tab, choose the type of access your app will have. For fetching tweets, the "Read" permission is usually enough.
However, if you want to interact with the Twitter account (post, like, etc.), you may want to choose "Read and Write."
Set Up Rate Limits: The Twitter API has rate limits that control how many requests you can make per 15-minute window. Keep this in mind if you’re planning to poll for tweets frequently.



**How to create telegram bot to get the tweet notification into telegram group**

Step 1: Create a Bot using BotFather
Open Telegram: Open the Telegram app (either on your phone or desktop).

Search for BotFather: In the search bar, type "BotFather" and select the official BotFather account (verified with a blue checkmark).

Create a New Bot:

Type /newbot and hit Enter.
BotFather will ask you for a name for your bot. This can be anything, for example, MyNotificationBot.
Then, it will ask for a username for your bot, which must be unique and should end with bot. For example, my_notification_bot.
Get Your Bot Token: After successfully creating the bot, BotFather will provide you with a token that you’ll use to interact with the Telegram Bot API. This token looks like:


1234567890:ABCDefGhijKLMNOPqrstuvwxyz_123456

Set Bot Settings (Optional):

You can also configure your bot by issuing other commands to BotFather:
/setdescription – Set a description for your bot.
/setabouttext – Set information about your bot.
/setuserpic – Set a profile picture for your bot.
Step 2: Add the Bot to a Telegram Group
Create or Open a Group:

If you don't have a group, create one by clicking on the New Group option.
Add members to the group, including yourself.
Add the Bot to the Group:

In the group, click on the group name at the top to open group settings.
Click on Add Members and search for your bot by its username (e.g., @my_notification_bot).
Select the bot to add it to the group.
Promote the Bot to Admin (Optional but Recommended):

If you want your bot to send messages automatically to the group (without restrictions), you might want to promote it to admin.
Go to group settings and click Administrators.
Find your bot and select it, then Promote it to an admin.
You can control the bot’s permissions, such as allowing it to send messages, pin messages, etc.
Step 3: Get the Chat ID of the Group
To send messages to the group, you need the Chat ID. There are a few ways to get the Chat ID:

Option 1: Using an API Call to Get the Chat ID
Send any message to the group (from any user).

Use the following URL (replace BOT_TOKEN with your bot’s token):

https://api.telegram.org/bot<BOT_TOKEN>/getUpdates
