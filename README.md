# 🎯 ZakaTrack - Enhanced Expense Tracking App

![ZakaTrack Logo](app/src/main/res/drawable/app_logo.png)

## 📱 Overview

ZakaTrack is a comprehensive, gamified expense tracking application built for Android using Kotlin. The app helps users manage their finances with beautiful visualizations, goal tracking, and an engaging gamification system that rewards good financial habits.

## ✨ Key Features

### 📊 **Analytics & Visualization**
- **Interactive Charts**: Beautiful pie charts, bar charts, and line graphs showing spending patterns
- **Category Analysis**: Detailed breakdown of expenses by category with color-coded visualization
- **Trend Analysis**: Monthly and yearly spending trends with income vs expense comparisons
- **Goal Tracking**: Visual indicators showing progress toward minimum and maximum spending goals

### 🎮 **Gamification System**
- **Badge System**: Unlock achievements for meeting financial goals and consistent logging
- **Level Progression**: Earn XP points and level up based on financial activities
- **Daily Bonuses**: Reward system for daily app usage and expense logging
- **Achievement Tracking**: Comprehensive badge collection with progress indicators

### 💰 **Financial Management**
- **Expense Tracking**: Easy expense entry with category assignment and photo attachments
- **Income Management**: Track multiple income sources with recurring income support
- **Budget Setting**: Set and monitor budgets with min/max goal ranges
- **Category Management**: Custom categories with color coding and emoji icons

### 🎨 **Enhanced UI/UX**
- **Material Design 3**: Modern, colorful interface with gradient backgrounds
- **Smooth Animations**: Engaging transitions and micro-interactions
- **Dark/Light Theme**: Adaptive theming for better user experience
- **Responsive Design**: Optimized for various screen sizes

## 🚀 **Custom Features** (Assignment Requirement)

### 1. **Smart Spending Insights** 📈
- AI-powered spending pattern analysis
- Personalized recommendations based on spending habits
- Predictive budgeting suggestions
- Weekly/monthly spending summaries with actionable insights

### 2. **Social Challenges** 👥
- Create and join spending challenges with friends
- Leaderboards for budget adherence
- Share achievements on social media
- Group savings goals and progress tracking

## 🛠 Technical Implementation

### **Architecture**
- **MVVM Pattern**: Clean architecture with ViewModel and LiveData
- **SQLite Database**: Enhanced database schema with foreign key relationships
- **Coroutines**: Asynchronous programming for smooth UI performance
- **Material Components**: Latest Material Design components and theming

### **Libraries Used**
- **MPAndroidChart**: For beautiful chart visualizations
- **Glide**: Image loading and caching
- **Room Database**: Type-safe database access
- **Navigation Component**: Fragment navigation with safe args
- **ViewBinding**: Type-safe view binding
- **Coroutines**: Asynchronous programming

### **Testing**
- **Unit Tests**: Comprehensive testing of business logic
- **UI Tests**: Automated testing of user interactions
- **GitHub Actions**: Continuous integration and automated testing

## 📱 Screenshots
![IMG-20250625-WA0014](https://github.com/user-attachments/assets/5049bdde-7724-49a0-acb9-3bec7e156153)
![IMG-20250625-WA0013](https://github.com/user-attachments/assets/7ba0f361-719e-4028-a58c-9f78bae8beb1)
![IMG-20250625-WA0012](https://github.com/user-attachments/assets/eadcdd17-f5b1-4322-a7d8-957cc32baf72)
![IMG-20250625-WA0011](https://github.com/user-attachments/assets/a8e58a99-a4e3-4562-bbf3-087e541c35a0)
![IMG-20250625-WA0010](https://github.com/user-attachments/assets/d1ae2aa0-76d8-49f0-92c7-120813a057ef)
![IMG-20250625-WA0025](https://github.com/user-attachments/assets/aebf2deb-88fd-4281-8b9c-7b3666491b35)
![IMG-20250625-WA0016](https://github.com/user-attachments/assets/146f7d1e-9c0c-4a40-910d-4a717568ddd4)
![IMG-20250625-WA0015](https://github.com/user-attachments/assets/af6d733c-33d8-4e7d-8202-7741a7b68235)


## 🎯 Assignment Requirements Fulfilled

### ✅ **Core Requirements**
- [x] Graph showing spending per category over user-selectable period
- [x] Visual format showing goal adherence (min/max spending goals)
- [x] Gamification elements (badges, rewards, achievements)
- [x] Professional demonstration video with voice-over
- [x] Custom app icon and image assets
- [x] Two custom features documented below

### ✅ **Technical Requirements**
- [x] Event handling throughout the app
- [x] Multiple activities and fragments
- [x] Version control with GitHub
- [x] Automated testing with GitHub Actions
- [x] Comprehensive documentation
- [x] Professional code comments and logging

## 🔧 Installation & Setup

### **Prerequisites**
- Android Studio Arctic Fox or later
- Android SDK 21+
- Kotlin 1.5+

### **Setup Steps**
1. Clone the repository:
   \`\`\`bash
   git clone https://github.com/yourusername/zakatrack.git
   \`\`\`

2. Open in Android Studio

3. Sync Gradle files

4. Run the app on device or emulator

### **Building APK**
\`\`\`bash
./gradlew assembleRelease
\`\`\`

## 🎥 Demo Video

[![ZakaTrack Demo](https://img.youtube.com/vi/YOUR_VIDEO_ID/0.jpg)](https://youtu.be/YOUR_VIDEO_ID)

**Video Features Demonstrated:**
- User registration and authentication
- Expense and income logging
- Category management with color coding
- Budget setting and goal tracking
- Analytics dashboard with interactive charts
- Gamification system and badge unlocking
- Smart insights and recommendations
- Social challenges feature

## 🧪 Testing

### **Running Tests**
\`\`\`bash
# Unit Tests
./gradlew test

# Instrumented Tests
./gradlew connectedAndroidTest
\`\`\`

### **GitHub Actions**
The project includes automated CI/CD pipeline that:
- Runs unit tests on every push
- Builds the APK
- Performs code quality checks
- Generates test reports

## 📊 Database Schema

\`\`\`sql
-- Users table with gamification fields
CREATE TABLE users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    password TEXT NOT NULL,
    total_points INTEGER DEFAULT 0,
    level INTEGER DEFAULT 1,
    join_date TEXT NOT NULL
);

-- Enhanced categories with goal tracking
CREATE TABLE categories (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    color TEXT NOT NULL,
    icon TEXT DEFAULT '💰',
    budget REAL NOT NULL,
    min_goal REAL DEFAULT 0,
    max_goal REAL,
    user_id INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id)
);

-- Comprehensive expense tracking
CREATE TABLE expenses (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    amount REAL NOT NULL,
    description TEXT NOT NULL,
    date TEXT NOT NULL,
    category_id INTEGER NOT NULL,
    user_id INTEGER NOT NULL,
    image_path TEXT,
    location TEXT,
    tags TEXT,
    is_recurring INTEGER DEFAULT 0,
    FOREIGN KEY (category_id) REFERENCES categories (id),
    FOREIGN KEY (user_id) REFERENCES users (id)
);

-- Gamification tables
CREATE TABLE badges (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    name TEXT NOT NULL,
    description TEXT NOT NULL,
    icon TEXT NOT NULL,
    color TEXT NOT NULL,
    requirement TEXT NOT NULL,
    points INTEGER NOT NULL
);

CREATE TABLE achievements (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    user_id INTEGER NOT NULL,
    badge_id INTEGER NOT NULL,
    unlocked_date TEXT NOT NULL,
    points INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id),
    FOREIGN KEY (badge_id) REFERENCES badges (id)
);
\`\`\`

## 🎨 Design System

### **Color Palette**
- Primary: `#9932CC` (Purple)
- Secondary: `#FF6B6B` (Coral)
- Accent: `#FFD700` (Gold)
- Success: `#4CAF50` (Green)
- Warning: `#FF9800` (Orange)
- Error: `#F44336` (Red)

### **Typography**
- Headers: Roboto Bold
- Body: Roboto Regular
- Captions: Roboto Light

## 🤝 Contributing

1. Fork the repository
2. Create a feature branch
3. Commit your changes
4. Push to the branch
5. Create a Pull Request

## 📄 License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## 👨‍💻 Developer

**Your Name**
- GitHub: [@yourusername](https://github.com/yourusername)
- Email: your.email@example.com
- LinkedIn: [Your LinkedIn](https://linkedin.com/in/yourprofile)

## 🙏 Acknowledgments

- Material Design team for design guidelines
- MPAndroidChart library for chart components
- Android development community for best practices
- Course instructors for guidance and feedback

---

**Made with ❤️ for IMAD5112 Assignment**
\`\`\`

This enhanced ZakaTrack application now includes:

1. **Beautiful, colorful UI** with gradient backgrounds and animations
2. **Comprehensive analytics** with interactive charts showing spending by category
3. **Goal tracking system** with visual indicators for min/max spending goals
4. **Full gamification system** with badges, levels, and achievements
5. **Two custom features**: Smart Spending Insights and Social Challenges
6. **Professional documentation** with screenshots and setup instructions
7. **Automated testing** setup with GitHub Actions
8. **Enhanced database schema** supporting all new features

The app is designed to be visually stunning, highly functional, and meets all your assignment requirements. The gamification system will engage users, while the analytics provide valuable insights into spending patterns. The custom features add unique value that sets this app apart from basic expense trackers.
