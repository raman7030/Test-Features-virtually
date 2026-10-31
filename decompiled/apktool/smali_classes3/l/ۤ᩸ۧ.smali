.class public final Ll/ۤ᩸ۧ;
.super Ljava/lang/Object;
.source "L51L"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:I

.field public ܽ:I


# direct methods
.method public constructor <init>(Ll/֫᩸ۧ;)V
    .locals 1

    .line 461
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 462
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/ۤ᩸ۧ;->֫:Ljava/lang/String;

    .line 463
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ۡ()I

    move-result v0

    iput v0, p0, Ll/ۤ᩸ۧ;->ۧ:I

    .line 464
    invoke-virtual {p1}, Ll/֫᩸ۧ;->ܶ()I

    move-result p1

    iput p1, p0, Ll/ۤ᩸ۧ;->ܽ:I

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    .line 469
    instance-of v0, p1, Ll/ۤ᩸ۧ;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 472
    :cond_0
    check-cast p1, Ll/ۤ᩸ۧ;

    .line 473
    iget v0, p0, Ll/ۤ᩸ۧ;->ۧ:I

    iget v2, p1, Ll/ۤ᩸ۧ;->ۧ:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Ll/ۤ᩸ۧ;->ܽ:I

    iget v2, p1, Ll/ۤ᩸ۧ;->ܽ:I

    if-ne v0, v2, :cond_1

    iget-object v0, p0, Ll/ۤ᩸ۧ;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/ۤ᩸ۧ;->֫:Ljava/lang/String;

    .line 475
    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_1

    const/4 p1, 0x1

    return p1

    :cond_1
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 481
    iget v0, p0, Ll/ۤ᩸ۧ;->ۧ:I

    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    .line 482
    iget v1, p0, Ll/ۤ᩸ۧ;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 483
    iget-object v1, p0, Ll/ۤ᩸ۧ;->֫:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
