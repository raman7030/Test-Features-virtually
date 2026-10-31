.class public final Ll/ܿ᩶᩻;
.super Ljava/lang/Object;
.source "J1YX"

# interfaces
.implements Ll/۠᩶᩻;


# instance fields
.field public final synthetic ᩸:Ll/ܳ᩶᩻;

.field public final synthetic ᩹:J


# direct methods
.method public constructor <init>(Ll/ܳ᩶᩻;J)V
    .locals 0

    .line 470
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܿ᩶᩻;->᩸:Ll/ܳ᩶᩻;

    iput-wide p2, p0, Ll/ܿ᩶᩻;->᩹:J

    return-void
.end method


# virtual methods
.method public final ֫(JJ)V
    .locals 1

    .line 473
    iget-object v0, p0, Ll/ܿ᩶᩻;->᩸:Ll/ܳ᩶᩻;

    invoke-virtual {v0, p1, p2, p3, p4}, Ll/᩹ܶۢ;->ܽ(JJ)V

    .line 474
    iget-wide p3, v0, Ll/ܳ᩶᩻;->ᩴ֫:J

    add-long/2addr p3, p1

    iget-wide p1, p0, Ll/ܿ᩶᩻;->᩹:J

    invoke-virtual {v0, p3, p4, p1, p2}, Ll/ۘ۠ۢ;->ۧ(JJ)V

    return-void
.end method

.method public final ᩻()Z
    .locals 1

    .line 479
    iget-object v0, p0, Ll/ܿ᩶᩻;->᩸:Ll/ܳ᩶᩻;

    .line 301
    invoke-virtual {v0}, Ll/ۘ۠ۢ;->᩻()Z

    move-result v0

    return v0
.end method
