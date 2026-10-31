.class public final Ll/ۧۖ֡;
.super Ll/ۨܺ֡;
.source "A4WL"


# instance fields
.field public ֫:Ll/ۛܺ֡;

.field public final ۧ:[Ll/ۛܺ֡;


# direct methods
.method public constructor <init>([Ll/ۛܺ֡;)V
    .locals 1

    .line 33
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 38
    iput-object v0, p0, Ll/ۧۖ֡;->֫:Ll/ۛܺ֡;

    .line 39
    iput-object p1, p0, Ll/ۧۖ֡;->ۧ:[Ll/ۛܺ֡;

    return-void
.end method


# virtual methods
.method public final ֫(Ljava/lang/String;)Ll/ۤܺ֡;
    .locals 5

    .line 44
    iget-object v0, p0, Ll/ۧۖ֡;->֫:Ll/ۛܺ֡;

    if-eqz v0, :cond_0

    .line 45
    invoke-interface {v0, p1}, Ll/ۛܺ֡;->֫(Ljava/lang/String;)Ll/ۤܺ֡;

    move-result-object p1

    return-object p1

    .line 47
    :cond_0
    iget-object v0, p0, Ll/ۧۖ֡;->ۧ:[Ll/ۛܺ֡;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_2

    aget-object v3, v0, v2

    .line 48
    invoke-interface {v3, p1}, Ll/ۛܺ֡;->֫(Ljava/lang/String;)Ll/ۤܺ֡;

    move-result-object v4

    if-eqz v4, :cond_1

    .line 50
    iput-object v3, p0, Ll/ۧۖ֡;->֫:Ll/ۛܺ֡;

    return-object v4

    :cond_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    return-object p1
.end method
