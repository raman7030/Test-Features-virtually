.class public final Ll/ۤۡܿ;
.super Ljava/lang/Object;
.source "R704"


# instance fields
.field public final ֫:I

.field public final ۧ:Ll/᩷ۢܿ;

.field public final ܽ:Ll/۬ۢܿ;

.field public volatile ܿ:Z

.field public final ᩳ:J


# direct methods
.method public constructor <init>(Ll/ۨۡܿ;Ll/۬ۢܿ;)V
    .locals 2

    .line 1038
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1039
    invoke-static {p1}, Ll/ۨۡܿ;->᩻(Ll/ۨۡܿ;)J

    move-result-wide v0

    iput-wide v0, p0, Ll/ۤۡܿ;->ᩳ:J

    .line 1040
    invoke-static {p1}, Ll/ۨۡܿ;->ܳ(Ll/ۨۡܿ;)Ll/᩷ۢܿ;

    move-result-object v0

    iput-object v0, p0, Ll/ۤۡܿ;->ۧ:Ll/᩷ۢܿ;

    .line 1041
    invoke-static {p1}, Ll/ۨۡܿ;->ܿ(Ll/ۨۡܿ;)I

    move-result p1

    iput p1, p0, Ll/ۤۡܿ;->֫:I

    .line 1042
    iput-object p2, p0, Ll/ۤۡܿ;->ܽ:Ll/۬ۢܿ;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ۤۡܿ;)V
    .locals 1

    const/4 v0, 0x1

    .line 0
    iput-boolean v0, p0, Ll/ۤۡܿ;->ܿ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 1045
    iget-boolean v0, p0, Ll/ۤۡܿ;->ܿ:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ll/ۤۡܿ;->ۧ:Ll/᩷ۢܿ;

    invoke-virtual {v0}, Ll/᩷ۢܿ;->֫()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
