# Calendar Helper

## Overview

This Java program, written by Naylene Rondon, is designed for a Florida Tech CIS 2503 programming assignment. The purpose of the program is to list various holidays (including the user's birthday) and compare their dates to determine which holiday is the soonest.

## Features

- Displays the current date.
- Accepts the user's birthday as input.
- Lists predefined holidays along with their dates.
- Adjusts the user's birthday to the current or next year if it has already passed.
- Calculates the number of days remaining until each holiday.
- Identifies the holiday that is the closest to the current date.

## How It Works

1. **Initialization**:
    - The program initializes the current date and a list of predefined holidays.
    - Holidays include Christmas, Halloween, Valentine’s Day, New Year’s Day, Veteran’s Day, and the user’s Birthday.

2. **User Input**:
    - The program prompts the user to enter their birthday in the format `MM/dd/yyyy`.
    - It updates the birthday in the holidays list.

3. **Date Comparison**:
    - The program formats and compares the current date with each holiday date.
    - It calculates the number of days remaining until each holiday.
    - It determines and outputs the soonest upcoming holiday.
