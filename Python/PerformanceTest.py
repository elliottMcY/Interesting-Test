import time

total_duration = 0
num_runs = 100

for i in range(num_runs):
    start_time = time.time()

    # Your code to be tested goes here
    for i in range(1000000):
        j = i + 1

    end_time = time.time()
    duration = (end_time - start_time) * 1000 # Time in milliseconds
    total_duration += duration

average_duration = total_duration / num_runs
print("Average execution time over {} runs: {:.2f} ms".format(num_runs, average_duration))


