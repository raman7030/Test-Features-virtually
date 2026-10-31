.class public final Ll/۬᩶۠;
.super Ljava/lang/Object;
.source "79RF"


# instance fields
.field public final ֫:Ll/ۛ᩶۠;


# direct methods
.method public constructor <init>()V
    .locals 1

    const/4 v0, 0x0

    throw v0
.end method

.method public constructor <init>(Ll/ۛ᩶۠;)V
    .locals 0

    .line 190
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 191
    iput-object p1, p0, Ll/۬᩶۠;->֫:Ll/ۛ᩶۠;

    return-void
.end method

.method public static synthetic ֫(Ll/۬᩶۠;)Ljava/lang/Object;
    .locals 0

    .line 185
    iget-object p0, p0, Ll/۬᩶۠;->֫:Ll/ۛ᩶۠;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    if-eqz p1, :cond_2

    .line 198
    const-class v1, Ll/۬᩶۠;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_1

    goto :goto_0

    .line 199
    :cond_1
    check-cast p1, Ll/۬᩶۠;

    .line 200
    iget-object v1, p0, Ll/۬᩶۠;->֫:Ll/ۛ᩶۠;

    iget-object p1, p1, Ll/۬᩶۠;->֫:Ll/ۛ᩶۠;

    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    const/4 v1, 0x0

    .line 205
    iget-object v2, p0, Ll/۬᩶۠;->֫:Ll/ۛ᩶۠;

    aput-object v2, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Ll/ۧ۫ᩴ;->hash([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method
