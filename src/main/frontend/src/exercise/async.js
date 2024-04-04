function delay(ms) {
  return new Promise(resolver => setTimeout(resolver, ms));
  // setTimeout(() => {}, ms); 이렇게 쓰면 실행 안됨.
}

function getApple() {
  delay(3000);      // 시간이 소요되는 작업
  return 'rotten Apple';
}

async function getBanana() {
  await delay(3000);
  return '제때 찾아오는 바나나';
}
// console.log(getApple());
// console.log(getBanana());
getBanana()
  .then(data => {console.log(data);});