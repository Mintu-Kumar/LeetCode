when shifting left (<<) multiplies by 2.
5 << 1 → 1010 → 10.
4 << 1 → 1000 → 8.

But shifting right divides by 2 (floor division).
So:

5 >> 1 = 2
10 >> 1 = 5
7 >> 1 = 3


👉 Rule of thumb:
num << 1 → multiply by 2.
num >> 1 → divide by 2 (floor).
