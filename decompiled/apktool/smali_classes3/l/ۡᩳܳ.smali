.class public final Ll/ۡᩳܳ;
.super Ljava/lang/Object;
.source "P71B"


# instance fields
.field public final ֫:Z

.field public final ۜ:J

.field public final ۧ:Z

.field public final ܳ:Ll/ۡᩳܳ;

.field public final ܽ:Ll/᩷ᩳܳ;

.field public final ܿ:I

.field public final ᩳ:I

.field public final ᩷:Ll/ۡᩳܳ;

.field public final ᩻:I


# direct methods
.method public constructor <init>(Ll/ۡᩳܳ;Ll/ۡᩳܳ;Ll/᩷ᩳܳ;IIIJZZ)V
    .locals 0

    .line 1055
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1056
    iput-object p1, p0, Ll/ۡᩳܳ;->ܳ:Ll/ۡᩳܳ;

    .line 1057
    iput-object p2, p0, Ll/ۡᩳܳ;->᩷:Ll/ۡᩳܳ;

    .line 1058
    iput-object p3, p0, Ll/ۡᩳܳ;->ܽ:Ll/᩷ᩳܳ;

    .line 1059
    iput p4, p0, Ll/ۡᩳܳ;->ᩳ:I

    .line 1060
    iput p5, p0, Ll/ۡᩳܳ;->᩻:I

    .line 1061
    iput p6, p0, Ll/ۡᩳܳ;->ܿ:I

    .line 1062
    iput-wide p7, p0, Ll/ۡᩳܳ;->ۜ:J

    .line 1063
    iput-boolean p9, p0, Ll/ۡᩳܳ;->֫:Z

    .line 1064
    iput-boolean p10, p0, Ll/ۡᩳܳ;->ۧ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Z
    .locals 1

    .line 1068
    iget-object v0, p0, Ll/ۡᩳܳ;->ܽ:Ll/᩷ᩳܳ;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method
