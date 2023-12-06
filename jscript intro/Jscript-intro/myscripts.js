const title = React.createElement(
    'h1', //HTML tag
    {id: 'main-title', title: 'This is a title.', className: 'title' }, //properties
    'My first REACT element!' //content
);

const desc = React.createElement(
    'p', //HTML tag
    null, //Implies there are no attributes
    'I just learned how to create a React node and render it into the DOM'
    //React node: node betekent een unit, een React node is een unit dat een DOM node kan worden
    //DOM: document object model = Naamgeving van HTML tags. de boom structuur van de website.
);

const header = React.createElement(
    'header', //HTML tag
    null,
    title,
    desc
);

ReactDOM.render(
    header,
    document.getElementById('root') //root, app container populair
);