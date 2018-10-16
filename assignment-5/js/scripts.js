var data = [{
        name: 'emmet',
        description: 'Emmet is the number one code snippet tool.',
        author: 'emmetio',
        downloads: 1662209,
        stars: 2534,
        price: 10.50,
        url: 'https://atom.io/packages/emmet',
        selector: 'p1'
    },
    {
        name: 'atom-beautify',
        description: 'The atom-beautify package will clean up your code, and make it more readable.',
        author: 'Glavin001',
        downloads: 4228040,
        stars: 4541,
        price: 6.75,
        url: 'https://atom.io/packages/atom-beautify',
        selector: 'p2'
    },
    {
        name: 'Ask Stack',
        description: 'Hate switching between your browser and the editor? The Ask Stack Overflow package allows you to quickly search Stack Overflow and get code samples directly in the Atom editor.',
        author: 'Chris911',
        downloads: 121,
        stars: 31,
        price: 6.45,
        url: 'https://atom.io/packages/ask-stack',
        selector: 'p3'
    },
    {
        name: 'git-blame',
        description: 'The git-blame package allows you to toggle git-blame annotations in the gutter of the Atom editor.',
        author: 'alexcorre',
        downloads: 440,
        stars: 541,
        price: 34.75,
        url: 'https://atom.io/packages/git-blame',
        selector: 'p4'
    },
    {
        name: 'linter-eslint',
        description: 'The Linter package is a base linter package that relies on sub-packages for specific languages.',
        author: 'AtomLinter',
        downloads: 28040,
        stars: 454,
        price: 3.75,
        url: 'https://atom.io/packages/linter-eslint',
        selector: 'p5'
    }
];

// (Atom) package constructor function
function Package(data) {
    this.name = data.name;
    this.description = data.description;
    this.author = data.author;
    this.downloads = data.downloads;
    this.stars = data.stars;
    this.price = data.price;
    this.url = data.url;
    this.selector = data.selector;

    this.getFormattedDownloads = function () {
        return this.downloads.toLocaleString();
    };

    this.getFormattedStars = function () {
        return this.stars.toLocaleString();
    };
}

var writePackageInfo = function (package) {
    // Get reference to the DOM elements
    var selector = package.selector,
        nameEl = document.getElementById(selector + '-name'),
        descEl = document.getElementById(selector + '-description'),
        authorEl = document.getElementById(selector + '-author'),
        downloadsEl = document.getElementById(selector + '-downloads'),
        starsEl = document.getElementById(selector + '-stars'),
        priceEl = document.getElementById(selector + '-price'),
        urlEl = document.getElementById(selector + '-url');
    // Write package data to DOM elements
    nameEl.textContent = package.name;
    descEl.textContent = package.description;
    authorEl.textContent = package.author;
    downloadsEl.textContent = package.downloads;
    starsEl.textContent = package.stars;
    priceEl.textContent = package.price;
    urlEl.textContent = package.url;
};

// Write package data for all the packages
var i = 0;
for (var i = 0; i < data.length; i++) {
    writePackageInfo(data[i]);
}

var currentDate = new Date();
document.getElementById("currentDate").innerHTML = currentDate.toDateString();
