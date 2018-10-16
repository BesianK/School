var user = "Human";
var salutation = "Welcome, ";
var greeting = salutation + user + "! Here is a nice review website.";
var greetingEl = document.getElementById("greeting");

greetingEl.textContent = greeting;

var laptopPrice = 2500,
  carPrice = 30000,
  receiverPrice = 400,
  studentDiscount = 0.1,
  laptopStudentPrice = laptopPrice - laptopPrice * studentDiscount,
  carStudentPrice = carPrice - carPrice * studentDiscount,
  receiverStudentPrice = receiverPrice - receiverPrice * studentDiscount;

var laptopPriceEl = document.getElementById("laptop-price"),
  laptopStudentPriceEl = document.getElementById("laptop-student-price");

laptopPriceEl.textContent = laptopPrice.toFixed(2);
laptopStudentPriceEl.textContent = laptopStudentPrice.toFixed(2);

var carPriceEl = document.getElementById("car-price"),
  carStudentPriceEl = document.getElementById("car-student-price");

carPriceEl.textContent = carPrice.toFixed(2);
carStudentPriceEl.textContent = carStudentPrice.toFixed(2);

var receiverPriceEl = document.getElementById("receiver-price"),
  receiverStudentPriceEl = document.getElementById("receiver-student-price");

receiverPriceEl.textContent = receiverPrice.toFixed(2);
receiverStudentPriceEl.textContent = receiverStudentPrice.toFixed(2);

var msg = new SpeechSynthesisUtterance(
  "Wizard's First Rule By Terry Goodkind CHAPTER 1 IT WAS AN ODD-LOOKING vine. Dusky variegated leaves hunkered against a stem that wound in a stranglehold around the smooth trunk of a balsam fir. Sap drooled down the wounded bark, and dry limbs slumped, making it look as if the tree were trying to voice a moan into the cool, damp morning air. Pods stuck out from the vine here and there along its length, almost seeming to look warily about for witnesses . It was the smell that first had caught his attention, a smell like the decomposition of something that had been wholly unsavory even in life. Richard combed his fingers through his thick hair as his mind lifted out of the fog of despair, coming into focus upon seeing the vine. He scanned for others, but saw none. Everything else looked normal. The maples of the upper Ven Forest were already tinged with crimson, proudly showing off their new mantle in the light breeze. With nights getting colder, it wouldn't be long before their cousins down in the Hartland Woods joined them. The oaks, being the last to surrender to the season, still stoically wore their dark green coats. Having spent most of his life in the woods, Richard knew all the plants-if not by name, by sight. From when Richard was very small, his friend Zedd had taken him along, hunting for special herbs. He had shown Richard which ones to look for, where they grew and why, and put names to everything they saw. Many times they just talked, the old man always treating him as an equal, asking as much as he answered Zedd had sparked Richard's hunger to learn, to know. This vine, though, he had seen only once before, and not in the woods. He had found a sprig of it at his father's house, in the blue clay jar Richard had made when he was a boy. His father had been a trader and had traveled often, looking for the chance exotic or rare item. People of means had often sought him out, interested in what he might have turned up. It seemed to be the looking, more than the finding, that he had liked, as he had always been happy to part with his latest discovery so he could be off after the next. From a young age, Richard had liked to spend time with Zedd while his father was away. Richard's brother, Michael, was a few years older, and having no interest in the woods, or in Zedd's rambling lectures, preferred to spend his time with people of means. About five years before, Richard had moved away to live on his own, but he often stopped by his father's home, unlike Michael, who was always busy and rarely had time to visit. Whenever his father went away, he would leave Richard a message in the blue jar telling him the latest news, some gossip, or of some sight he had seen. On the day three weeks before when Michael had come to tell him their father had been murdered, Richard had gone to his father's house, despite his brother's insistence that there was no reason to go, nothing he could do. Richard had long since passed the age when he did as his brother said. Wanting to spare him, the people there didn't let him see the body. But still, he saw the big, sickening splashes and puddles of blood, brown and dry across the plank floor. When Richard came close, voices fell silent, except to offer sympathy, which only deepened the riving pain. Yet he had heard them talking, in hushed tones, of the stories and the wild rumors of things come out of the boundary. Of magic."
);
speechSynthesis.speak(msg);
