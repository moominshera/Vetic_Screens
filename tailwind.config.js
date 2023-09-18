/** @type {import('tailwindcss').Config} */
module.exports = {
  content: [
    './App.{js,jsx,ts,tsx}',
    './components/**/*.{js,jsx,ts,tsx}',
    './screens/**/*.{js,jsx,ts,tsx}',
  ],
  assests: ['./assests/typography'],
  theme: {
    extend: {
      colors: {
        primary: '#FFCC00',
        languageBarSelected: '#424242',
        languageBarNotSelected: '#E7E7E7',
        languageBtnNotSelected: '#CACACA',
        languageBtnBorder: 'rgba(3, 24, 13, 0.32)',
        languageHeadingText: 'rgba(3, 24, 13, 0.88)',
        languageBtnText: 'rgba(3, 24, 13, 0.80)',
        body: '#ccc',
      },
    },
    plugins: [],
  },
};
