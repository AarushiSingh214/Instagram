# Project 4 - *Instagram*

**Instagram** is a photo sharing app using Parse as its backend.

Time spent: **18** hours spent in total

## User Stories

The following **required** functionality is completed:

- [x] User sees app icon in home screen.
- [x] User can sign up to create a new account using Parse authentication
- [x] User can log in to his or her account
- [x] The current signed in user is persisted across app restarts
- [x] User can log out of his or her account
- [x] User can take a photo, add a caption, and post it to "Instagram"
- [x] User can view the last 20 posts submitted to "Instagram"
- [x] User can pull to refresh the last 20 posts submitted to "Instagram"
- [x] User can tap a post to go to a Post Details activity, which includes timestamp and caption.
- [x] User sees app icon in home screen

The following **stretch** features are implemented:

- [x] Style the login page to look like the real Instagram login page.
- [x] Style the feed to look like the real Instagram feed.
- [ ] User can load more posts once he or she reaches the bottom of the feed using endless scrolling.
- [x] User should switch between different tabs using fragments and a Bottom Navigation View.
  - [x] Feed Tab (to view all posts from all users)
  - [ ] Capture Tab (to make a new post using the Camera and Photo Gallery)
  - [ ] Profile Tab (to view only the current user's posts, in a grid)
- [ ] Show the username and creation time for each post
- User Profiles:
  - [ ] Allow the logged in user to add a profile photo
  - [ ] Display the profile photo with each post
  - [ ] Tapping on a post's username or profile photo goes to that user's profile page
  - [ ] User Profile shows posts in a grid
- [ ] After the user submits a new post, show an indeterminate progress bar while the post is being uploaded to Parse
- [ ] User can comment on a post and see all comments for each post in the post details screen.
- [ ] User can like a post and see number of likes for each post in the post details screen.

The following **additional** features are implemented:

- [X] List anything else that you can get done to improve the app functionality!
I added a sign up and login page before the initial login.


Please list two areas of the assignment you'd like to **discuss further with your peers** during the next class (examples include better ways to implement something, how to extend your app in certain ways, etc):

1. I would like to discuss how to get data from the Back4App
2.I would also like to discuss some of the other bonus like gridview and comments with my peers.

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='logging_in.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='home_screen.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='taking_pic.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='submiting_pic.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='refresh_details.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='logot_icon.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='register.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='user_persists.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />
<img src='user_profile.gif' title='Video Walkthrough' width='' alt='Video Walkthrough' />


GIF created with [Kap](https://getkap.co/).

## Credits

List an 3rd party libraries, icons, graphics, or other assets you used in your app.

- [Android Async Http Client](http://loopj.com/android-async-http/) - networking library


## Notes

Describe any challenges encountered while building the app.
I was trying to get the number of likes to appear when the user liked teh photo but for some reason, it kept on showing up as null and I asked teh ta but we were unable to find a solution. 

## License

    Copyright 2021 Aarushi Singh

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
