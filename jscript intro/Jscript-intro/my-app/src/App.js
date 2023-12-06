import React from 'react';

function App() {
const title = React.createElement(
    'h1', //HTML tag
    {id: 'main-title', title: 'This is a title.' }, //properties
    'My first REACT element!' //content
);
    return(
        title
    );
}

export default App;