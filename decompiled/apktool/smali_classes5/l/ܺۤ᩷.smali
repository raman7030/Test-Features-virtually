.class public final Ll/ܺۤ᩷;
.super Ljava/lang/Object;
.source "31K1"

# interfaces
.implements Ll/ۛۛ᩷;


# instance fields
.field public final synthetic ᩸:Ll/ۖۤ᩷;


# direct methods
.method public constructor <init>(Ll/ۖۤ᩷;)V
    .locals 0

    .line 2287
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    return-void
.end method


# virtual methods
.method public final ֡()V
    .locals 2

    .line 2310
    iget-object v0, p0, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v0, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    const v1, 0x7f12041d

    invoke-virtual {v0, v1}, Ll/᩺ۤܿ;->֫(I)V

    return-void
.end method

.method public final ֫(I)V
    .locals 1

    .line 2305
    iget-object v0, p0, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v0, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->ۧ(I)V

    return-void
.end method

.method public final ۢ(Ljava/lang/String;)V
    .locals 1

    .line 2290
    iget-object v0, p0, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v0, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0, p1}, Ll/᩺ۤܿ;->֫(Ljava/lang/CharSequence;)V

    return-void
.end method

.method public final ܰ()V
    .locals 2

    .line 2295
    iget-object v0, p0, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v0, v0, Ll/ۖۤ᩷;->ۜ:Ll/ܿۛ᩷;

    invoke-static {v0}, Ll/ܿۛ᩷;->᩶(Ll/ܿۛ᩷;)Ll/ۘۛ᩷;

    move-result-object v0

    invoke-virtual {v0}, Ll/ۘۛ᩷;->ۖ()V

    .line 2296
    new-instance v0, Ll/᩻۫᩷;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ll/᩻۫᩷;-><init>(ILjava/lang/Object;)V

    invoke-static {v0}, Ll/ۙ᩸᩷;->֫(Ljava/lang/Runnable;)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 2315
    iget-object v0, p0, Ll/ܺۤ᩷;->᩸:Ll/ۖۤ᩷;

    iget-object v0, v0, Ll/ۖۤ᩷;->᩻:Ll/᩺ۤܿ;

    invoke-virtual {v0}, Ll/᩺ۤܿ;->᩻()Z

    move-result v0

    return v0
.end method
