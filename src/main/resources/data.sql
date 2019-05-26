INSERT INTO user (id, username, password) VALUES
  (1,'laurence','laurence');
  
INSERT INTO property (id, name) VALUES
  (1,'House'),
  (2,'Car'),
  (3,'Motorcycle'),
  (4,'Apartment');

INSERT INTO user_detail (id, user_id, full_name, job, country, 
city, dob, address, email, phone, link_photo, link_fb, link_ig,
link_twitter, skill, link_photo1, link_photo2, link_photo3,
link_friends1, link_friends2, link_friends3) VALUES
  (1,1,'Laurence','Software Developer','Indonesia','Jakarta',
  '2010-10-10','Jl. Gotong Royong No.80','laurencebutarbutar@gmail.com',
  '+62 81381612870','https://scontent-sin6-1.xx.fbcdn.net/v/t31.0-8/1072436_10201614489428856_93847078_o.jpg?_nc_cat=100&_nc_ht=scontent-sin6-1.xx&oh=e272c5e98a89df5deee9630f15f86cdf&oe=5D5A7259',
  'https://www.facebook.com/laurence.butarbutar','https://www.instagram.com/shade_hard_line/','https://twitter.com/shade_hard_line',
  'Adobe Photoshop, Corel Draw, Graphic Design, CSS',
  'https://scontent-sin6-1.xx.fbcdn.net/v/t31.0-8/901073_10200198621153034_619345332_o.jpg?_nc_cat=106&_nc_ht=scontent-sin6-1.xx&oh=c4ac2a23662111440fd4cfe7d98c4e76&oe=5D671D4F',
  'https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/1381968_10200801608387338_1432902616_n.jpg?_nc_cat=107&_nc_ht=scontent-sin2-1.xx&oh=a53285abd68eac0ce0cee2639dbaa691&oe=5D9EEA7F',
  'https://scontent-sin2-1.xx.fbcdn.net/v/t1.0-9/1395781_10200801623427714_600507687_n.jpg?_nc_cat=109&_nc_ht=scontent-sin2-1.xx&oh=95a502222361caf1108400b342d7d8e3&oe=5D62474E',
  'https://images.unsplash.com/flagged/photo-1558765363-678bdcb1f50c?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80',
  'https://images.unsplash.com/photo-1556741533-e228ee50f8b8?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=750&q=80',
  'https://images.unsplash.com/photo-1556741533-927182355585?ixlib=rb-1.2.1&auto=format&fit=crop&w=1534&q=80');  
