// app/page.tsx
"use client";

import React from "react";

type Feature = {
  id: number;
  title: string;
  description: string;
  icon: React.ReactNode;
};

const features: Feature[] = [
  {
    id: 1,
    title: "Scalable by design",
    description:
      "Built for growth with modular components, responsive layout, and accessible patterns.",
    icon: <span aria-hidden="true">📈</span>,
  },
  {
    id: 2,
    title: "Performance first",
    description:
      "Lean assets, semantic markup, and best practices to keep your pages fast.",
    icon: <span aria-hidden="true">⚡</span>,
  },
  {
    id: 3,
    title: "Type-safe",
    description:
      "End-to-end TypeScript types for predictable and maintainable development.",
    icon: <span aria-hidden="true">✅</span>,
  },
];

export default function Page(): JSX.Element {
  return (
    <main>
      {/* Navigation */}
      <header className="nav">
        <div className="container nav-inner" role="navigation" aria-label="Primary">
          <a href="/" className="logo" aria-label="Home">
            CloudCraft
          </a>
          <nav className="nav-links">
            <a href="#features">Features</a>
            <a href="#pricing">Pricing</a>
            <a href="#contact" className="cta-outline">Contact</a>
          </nav>
        </div>
      </header>

      {/* Hero */}
      <section className="hero">
        <div className="container hero-inner">
          <div className="hero-content">
            <h1>
              Build resilient, scalable, and sustainable experiences—without the bloat
            </h1>
            <p className="lead">
              A clean, type-safe landing page to launch faster. Designed for clarity,
              speed, and conversion. Perfect for product previews, cloud services,
              or technical landing pages.
            </p>
            <div className="hero-actions">
              <a className="cta" href="#get-started">Get started</a>
              <a className="cta-secondary" href="#demo">View demo</a>
            </div>
            <p className="subtle">
              No framework lock-in. Works great with Next.js, Vite, or Remix.
            </p>
          </div>
          <div className="hero-art" aria-hidden="true">
            {/* Simple decorative graphic */}
            <div className="orb orb1" />
            <div className="orb orb2" />
            <div className="grid" />
          </div>
        </div>
      </section>

      {/* Features */}
      <section id="features" className="features">
        <div className="container">
          <h2>Why teams choose CloudCraft</h2>
          <div className="feature-grid" role="list">
            {features.map((f) => (
              <article key={f.id} role="listitem" className="feature-card">
                <div className="feature-icon">{f.icon}</div>
                <h3>{f.title}</h3>
                <p>{f.description}</p>
              </article>
            ))}
          </div>
        </div>
      </section>

      {/* Social proof */}
      <section className="social-proof">
        <div className="container proof-inner">
          <div className="logos" aria-label="Trusted by">
            <span className="logo">Aurora</span>
            <span className="logo">Nimbus</span>
            <span className="logo">Vector</span>
            <span className="logo">Helios</span>
          </div>
          <p className="quote">
            “We shipped in days, not weeks. Clean structure and performance out of the box.”
            <span className="quote-author">— Product Lead, Aurora</span>
          </p>
        </div>
      </section>

      {/* CTA */}
      <section id="get-started" className="cta-section">
        <div className="container cta-inner">
          <h2>Launch your next page in minutes</h2>
          <p>
            Copy this file, adjust content, and deploy. Add analytics, forms, and A/B tests
            as you grow—TypeScript keeps it sane.
          </p>
          <form
            className="cta-form"
            onSubmit={(e) => {
              e.preventDefault();
              // Replace with your submission logic
              alert("Thanks! We'll be in touch soon.");
            }}
          >
            <label htmlFor="email" className="sr-only">
              Email
            </label>
            <input
              id="email"
              type="email"
              required
              placeholder="you@company.com"
              aria-label="Email address"
            />
            <button type="submit" className="cta">Request access</button>
          </form>
          <small className="privacy">
            We respect your privacy. Unsubscribe anytime.
          </small>
        </div>
      </section>

      {/* Footer */}
      <footer className="footer">
        <div className="container footer-inner">
          <p className="copyright">
            © {new Date().getFullYear()} CloudCraft. All rights reserved.
          </p>
          <div className="footer-links">
            <a href="#privacy">Privacy</a>
            <a href="#terms">Terms</a>
            <a href="#contact">Contact</a>
          </div>
        </div>
      </footer>

      {/* Styles */}
      <style jsx>{`
        :root {
          --bg: #0b0f1a;
          --panel: #111827;
          --muted: #9ca3af;
          --text: #e5e7eb;
          --primary: #22c55e;
          --primary-700: #16a34a;
          --accent: #60a5fa;
          --ring: rgba(96, 165, 250, 0.35);
          --border: #1f2937;
        }
        * { box-sizing: border-box; }
        html, body, main { margin: 0; padding: 0; background: var(--bg); color: var(--text); font-family: Inter, system-ui, -apple-system, Segoe UI, Roboto, "Helvetica Neue", Arial, "Noto Sans", "Apple Color Emoji", "Segoe UI Emoji", "Segoe UI Symbol", "Noto Color Emoji", sans-serif; }
        a { color: inherit; text-decoration: none; }
        .sr-only { position: absolute; width: 1px; height: 1px; padding: 0; margin: -1px; overflow: hidden; clip: rect(0, 0, 0, 0); border: 0; }
        .container { max-width: 1100px; margin: 0 auto; padding: 0 1.25rem; }

        /* Nav */
        .nav { position: sticky; top: 0; backdrop-filter: saturate(160%) blur(8px); background: rgba(11, 15, 26, 0.6); border-bottom: 1px solid var(--border); z-index: 10; }
        .nav-inner { display: flex; align-items: center; justify-content: space-between; height: 64px; }
        .logo { font-weight: 700; letter-spacing: 0.2px; }
        .nav-links { display: flex; gap: 1rem; }
        .nav-links a { color: var(--muted); }
        .cta-outline { border: 1px solid var(--border); padding: 0.35rem 0.7rem; border-radius: 8px; }
        .cta-outline:hover { border-color: var(--accent); color: var(--text); }

        /* Hero */
        .hero { padding: 5rem 0 3.5rem; border-bottom: 1px solid var(--border); }
        .hero-inner { display: grid; grid-template-columns: 1.1fr 0.9fr; gap: 2rem; align-items: center; }
        .hero-content h1 { font-size: 2.4rem; line-height: 1.15; margin: 0 0 1rem; }
        .lead { color: var(--muted); font-size: 1.05rem; margin: 0 0 1.5rem; }
        .hero-actions { display: flex; gap: 0.75rem; }
        .cta { background: var(--primary); color: #06140a; padding: 0.6rem 1rem; border-radius: 10px; font-weight: 600; border: 1px solid #0f3b21; box-shadow: 0 0 0 0 rgba(34, 197, 94, 0.4); transition: box-shadow 150ms ease, transform 150ms ease; }
        .cta:hover { box-shadow: 0 0 0 6px var(--ring); transform: translateY(-1px); }
        .cta-secondary { padding: 0.6rem 1rem; border-radius: 10px; border: 1px solid var(--border); color: var(--text); }
        .subtle { color: var(--muted); margin-top: 0.75rem; font-size: 0.95rem; }
        .hero-art { position: relative; min-height: 280px; border: 1px solid var(--border); border-radius: 16px; overflow: hidden; background: linear-gradient(180deg, rgba(17,24,39,0.8), rgba(11,15,26,0.8)); }
        .grid { position: absolute; inset: 0; background-image: radial-gradient(rgba(96,165,250,0.12) 1px, transparent 1px); background-size: 18px 18px; }
        .orb { position: absolute; filter: blur(18px); border-radius: 50%; opacity: 0.6; }
        .orb1 { width: 160px; height: 160px; left: 10%; top: 15%; background: #60a5fa; }
        .orb2 { width: 220px; height: 220px; right: 8%; bottom: 12%; background: #22c55e; }

        /* Features */
        .features { padding: 3.5rem 0; }
        .features h2 { font-size: 1.8rem; margin-bottom: 1.25rem; }
        .feature-grid { display: grid; grid-template-columns: repeat(3, 1fr); gap: 1rem; }
        .feature-card { background: var(--panel); border: 1px solid var(--border); border-radius: 12px; padding: 1rem; }
        .feature-icon { font-size: 1.25rem; margin-bottom: 0.5rem; }
        .feature-card h3 { margin: 0.25rem 0 0.5rem; font-size: 1.1rem; }
        .feature-card p { color: var(--muted); margin: 0; }

        /* Social proof */
        .social-proof { padding: 2.75rem 0; border-top: 1px solid var(--border); border-bottom: 1px solid var(--border); }
        .proof-inner { display: grid; grid-template-columns: 1fr; gap: 1rem; text-align: center; }
        .logos { display: flex; justify-content: center; gap: 1rem; flex-wrap: wrap; }
        .logo { color: var(--muted); border: 1px dashed var(--border); border-radius: 8px; padding: 0.4rem 0.6rem; font-size: 0.9rem; }
        .quote { color: var(--muted); }
        .quote-author { color: var(--text); margin-left: 0.5rem; }

        /* CTA section */
        .cta-section { padding: 3rem 0; }
        .cta-inner { text-align: center; max-width: 720px; }
        .cta-form { margin: 1rem 0; display: grid; grid-template-columns: 1fr auto; gap: 0.5rem; }
        .cta-form input { background: var(--panel); border: 1px solid var(--border); border-radius: 10px; padding: 0.6rem 0.75rem; color: var(--text); }
        .cta-form input:focus { outline: none; border-color: var(--accent); box-shadow: 0 0 0 5px var(--ring); }
        .privacy { color: var(--muted); display: block; margin-top: 0.25rem; }

        /* Footer */
        .footer { padding: 2rem 0; border-top: 1px solid var(--border); }
        .footer-inner { display: flex; align-items: center; justify-content: space-between; }
        .footer-links { display: flex; gap: 1rem; }
        .footer-links a { color: var(--muted); }

        /* Responsive */
        @media (max-width: 960px) {
          .hero-inner { grid-template-columns: 1fr; }
        }
        @media (max-width: 720px) {
          .feature-grid { grid-template-columns: 1fr; }
          .cta-form { grid-template-columns: 1fr; }
          .nav-inner { height: auto; padding: 0.8rem 0; }
          .nav-links { flex-wrap: wrap; }
        }
      `}</style>
    </main>
  );
}

