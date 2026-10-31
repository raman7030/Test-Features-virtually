.class public final synthetic Ll/᩹ܿۧ;
.super Ljava/lang/Object;
.source "38N3"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ۙ:J

.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/᩶ܿۧ;

.field public final synthetic ᩹:I


# direct methods
.method public synthetic constructor <init>(Ll/᩶ܿۧ;IJJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/᩹ܿۧ;->᩸:Ll/᩶ܿۧ;

    iput p2, p0, Ll/᩹ܿۧ;->᩹:I

    iput-wide p3, p0, Ll/᩹ܿۧ;->᩶:J

    iput-wide p5, p0, Ll/᩹ܿۧ;->ۙ:J

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 6

    .line 2
    iget-wide v4, p0, Ll/᩹ܿۧ;->ۙ:J

    .line 81
    iget-object v0, p0, Ll/᩹ܿۧ;->᩸:Ll/᩶ܿۧ;

    invoke-static {v0}, Ll/᩶ܿۧ;->ۧ(Ll/᩶ܿۧ;)Ll/ۗܿۧ;

    move-result-object v0

    iget-wide v1, p0, Ll/᩹ܿۧ;->᩶:J

    iget v3, p0, Ll/᩹ܿۧ;->᩹:I

    invoke-interface/range {v0 .. v5}, Ll/ۗܿۧ;->ۧ(JIJ)V

    return-void
.end method
