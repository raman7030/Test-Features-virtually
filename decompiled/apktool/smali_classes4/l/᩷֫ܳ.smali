.class public final Ll/᩷֫ܳ;
.super Ljava/lang/Object;
.source "J57U"


# instance fields
.field public final ֫:Ll/ᩳܽܳ;

.field public final ۧ:I

.field public final ܽ:J

.field public final ᩳ:I


# direct methods
.method public constructor <init>(Ll/ᩳܽܳ;JII)V
    .locals 1

    .line 853
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "document"

    .line 854
    invoke-static {p1, v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Ll/᩷֫ܳ;->֫:Ll/ᩳܽܳ;

    .line 855
    iput-wide p2, p0, Ll/᩷֫ܳ;->ܽ:J

    .line 856
    iput p4, p0, Ll/᩷֫ܳ;->ᩳ:I

    .line 857
    iput p5, p0, Ll/᩷֫ܳ;->ۧ:I

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ᩳܽܳ;IIZ)Z
    .locals 4

    if-eqz p4, :cond_0

    .line 862
    iget-object p4, p0, Ll/᩷֫ܳ;->֫:Ll/ᩳܽܳ;

    if-ne p4, p1, :cond_0

    iget-wide v0, p0, Ll/᩷֫ܳ;->ܽ:J

    .line 863
    invoke-virtual {p1}, Ll/ᩳܽܳ;->ۖ()J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    iget p1, p0, Ll/᩷֫ܳ;->ᩳ:I

    if-ne p1, p2, :cond_0

    iget p1, p0, Ll/᩷֫ܳ;->ۧ:I

    if-ne p1, p3, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
