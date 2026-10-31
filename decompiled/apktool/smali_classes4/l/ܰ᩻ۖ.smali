.class public final Ll/ܰ᩻ۖ;
.super Ll/۠ᩳۖ;
.source "V82C"


# static fields
.field public static final ۧ:Ll/ܶᩳۖ;


# instance fields
.field public final ֫:Ll/۠ᩳۖ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 31
    new-instance v0, Ll/᩺᩻ۖ;

    invoke-direct {v0}, Ll/᩺᩻ۖ;-><init>()V

    sput-object v0, Ll/ܰ᩻ۖ;->ۧ:Ll/ܶᩳۖ;

    return-void
.end method

.method public constructor <init>(Ll/۠ᩳۖ;)V
    .locals 0

    .line 47
    invoke-direct {p0}, Ll/۠ᩳۖ;-><init>()V

    .line 48
    iput-object p1, p0, Ll/ܰ᩻ۖ;->֫:Ll/۠ᩳۖ;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ܿۜۖ;)Ljava/lang/Object;
    .locals 3

    .line 53
    iget-object v0, p0, Ll/ܰ᩻ۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1}, Ll/۠ᩳۖ;->֫(Ll/ܿۜۖ;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/Date;

    if-eqz p1, :cond_0

    .line 54
    new-instance v0, Ljava/sql/Timestamp;

    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/sql/Timestamp;-><init>(J)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V
    .locals 1

    .line 29
    check-cast p2, Ljava/sql/Timestamp;

    .line 59
    iget-object v0, p0, Ll/ܰ᩻ۖ;->֫:Ll/۠ᩳۖ;

    invoke-virtual {v0, p1, p2}, Ll/۠ᩳۖ;->֫(Ll/᩻ۜۖ;Ljava/lang/Object;)V

    return-void
.end method
