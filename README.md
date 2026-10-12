# Assignment 5 — Java File I/O

Programs based on the provided Lecture 6 starter templates.

## Run
From inside the Assignment5 folder:

```sh
javac ScoreWriter.java ScoreReport.java
java ScoreWriter
java ScoreReport
```

Run ScoreWriter first; it creates/replaces `scores.txt` in the current working directory. Then run ScoreReport and enter `scores.txt`.

## Test cases
- Writer: three students, including an invalid score of 150; re-prompt and accept 60.
- Writer: boundary scores 0 and 100, and non-numeric input.
- Writer: enter `quit` immediately (creates an empty file). Re-run writer afterward to restore the sample file.
- Report: wrong file name followed by `scores.txt`.
- Report: blank lines between records (see `scores_with_blank_lines.txt`).

Screenshots in `screenshots/` show actual terminal runs captured from the test commands. The source programs and `scores.txt` are the required files; the extra blank-line file is for testing only.
