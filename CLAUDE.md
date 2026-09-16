# Quack!

Campus meetup app. A student pins an event on a map with a time and one line of detail
("Studying for CS102!"); nearby students see it and join. Semester project: 14 weeks,
4 people, one campus, one client platform.

Full problem statement, scope, and timeline live in `docs/overview.md`.

## Commands

<!-- Fill these in during week 2, once the project is scaffolded. -->

- Install:
- Dev server:
- Test:
- Lint:
- Build:
- Deploy:

## Stack

Not chosen yet. The decision lands in week 2. Do not scaffold a stack, add a framework,
or assume one is in place. Ask.

## Priorities

Build in this order. Do not start a P1 item while a P0 item is unfinished.

P0, the core loop:

1. Account creation and login
2. Create an event with map location, date, time, and a one-line description
3. Map view of nearby events
4. Event detail view showing who has joined
5. Join an event, and leave one already joined

P1, only after the loop works end to end:

6. Host edits or cancels their own event
7. Event visibility, public or link only
8. Date filter covering past and upcoming events
9. Host sees view and join counts per event

P2, do not build without asking first:

Profiles, interests, friends list, personal invites, category and distance filters,
attendance caps, notifications on edit or cancel, report and block, activity heatmap.

Out of scope for this semester:

Messaging, social feeds, payments, ticketing, recurring events, check-in, ratings,
identity verification, moderation and admin dashboards.

## Rules

- Every change traces to a numbered story above. If a request implies work outside that
  list, say so before writing code.
- Do not add a runtime dependency without asking.
- Secrets live in `.env` and never in the repo. Flag any key that appears in a diff.
- Do not log precise coordinates next to a user id.
- Do not add analytics or third-party tracking.
- Keep the seed script working. An empty map demos badly.

## Vocabulary

Use these exact terms in code, UI copy, and commit messages:

- `Event` is the posted thing. "Pin" appears only in UI copy about the map. Never
  "meetup", "party", or "activity" as a type name.
- `host` is the creator. Not "organizer", not "owner".
- `attendee` is someone who joined. Not "guest", not "participant".
- `visibility` is `public` or `link_only`. There is no third value.
- Joining is reversible: `join` and `leave`. Never "RSVP".

## Git

- One branch per story, named `story-3-map-discovery`.
- Reference the story number in the commit subject.
- No direct pushes to `main`. Every pull request gets one teammate review.

## Do not guess on these

Ask the team rather than picking an answer:

- Pin granularity, and whether off-campus or residential locations are allowed
- How far back the date filter reaches, and whether a host can delete a past event
- What an attendee sees about other attendees before showing up
- What counts as a "view" for story 9
