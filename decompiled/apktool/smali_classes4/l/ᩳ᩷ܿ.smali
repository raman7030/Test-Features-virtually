.class public final Ll/ᩳ᩷ܿ;
.super Ljava/lang/Object;
.source "B4S2"


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;I)V
    .locals 0

    .line 1377
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1378
    iput-object p1, p0, Ll/ᩳ᩷ܿ;->ۧ:Ljava/lang/String;

    .line 1379
    iput p2, p0, Ll/ᩳ᩷ܿ;->֫:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_1

    .line 1392
    const-class v1, Ll/ᩳ᩷ܿ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v2

    if-eq v1, v2, :cond_0

    goto :goto_0

    .line 1394
    :cond_0
    check-cast p1, Ll/ᩳ᩷ܿ;

    .line 1395
    iget v1, p0, Ll/ᩳ᩷ܿ;->֫:I

    iget v2, p1, Ll/ᩳ᩷ܿ;->֫:I

    if-ne v1, v2, :cond_1

    iget-object v1, p0, Ll/ᩳ᩷ܿ;->ۧ:Ljava/lang/String;

    iget-object p1, p1, Ll/ᩳ᩷ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    :goto_0
    return v0
.end method

.method public final hashCode()I
    .locals 2

    .line 1400
    iget-object v0, p0, Ll/ᩳ᩷ܿ;->ۧ:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 1401
    iget v1, p0, Ll/ᩳ᩷ܿ;->֫:I

    add-int/2addr v0, v1

    return v0
.end method
