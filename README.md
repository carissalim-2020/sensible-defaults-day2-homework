This project was developed with the assistance of Github Copilot.
Base Java Gradle project was setup with Intellij, dependencies were manually configured. Directory structure and Product.java were manually created and configured.

Prompting process for /list API:
1. Prompt: Implement a /list GET request that takes in the input parameters 'page' and 'numberOfResults'. 'numberOfResults' is an optional parameter with a default value of 15 and a max value of 30. /list should return products with server side pagination in JSON format, based on the input parameters.
   https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/2d31ee6d-5961-431c-a930-a94364150c20
   <img width="691" alt="Collecting context" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/2d31ee6d-5961-431c-a930-a94364150c20">
   <img width="692" alt="First, modity the Productcontroller" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/1baeb41b-7e71-4dd6-b347-826732e876be">
   <img width="693" alt="Screenshot 2024-05-16 at 3 30 49 PM" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/a7bee081-20b2-42fb-b415-612f931a1c60">
   <img width="687" alt="some additional pagination information such as the total number of pages and whether there are more pages" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/36377d3e-f6d1-47bf-9259-a50598860bde">
2. Modify the /list to a POST request. Response should be in JSON format. Implement unit tests for all methods.
   <img width="692" alt="Screenshot 2024-05-16 at 3 36 52 PM" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/7dc0155b-4ad7-459b-9ffc-6d862d37ab40">
   <img width="747" alt="Screenshot 2024-05-16 at 3 40 02 PM" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/ded3be5e-2fe1-4a46-afbc-a84000d0ff32">
   <img width="742" alt="Screenshot 2024-05-16 at 3 40 52 PM" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/1e3e5949-84fc-4311-a926-8117ea2a48b8">
   <img width="728" alt="Screenshot 2024-05-16 at 3 41 08 PM" src="https://github.com/carissalim-2020/sensible-defaults-day2-homework/assets/61401124/ba601d13-70e8-496a-9b7f-9e6223861659">
