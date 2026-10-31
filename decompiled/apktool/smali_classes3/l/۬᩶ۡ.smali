.class public final Ll/۬᩶ۡ;
.super Ljava/lang/Object;
.source "V1UX"


# instance fields
.field public ֫:Ljava/lang/CharSequence;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 112
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 113
    iput-object p1, p0, Ll/۬᩶ۡ;->֫:Ljava/lang/CharSequence;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 2

    if-ne p0, p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    if-eqz p1, :cond_2

    .line 124
    const-class v0, Ll/۬᩶ۡ;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    if-eq v0, v1, :cond_1

    goto :goto_0

    .line 125
    :cond_1
    check-cast p1, Ll/۬᩶ۡ;

    .line 126
    iget-object v0, p0, Ll/۬᩶ۡ;->֫:Ljava/lang/CharSequence;

    iget-object p1, p1, Ll/۬᩶ۡ;->֫:Ljava/lang/CharSequence;

    invoke-static {v0, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    return p1

    :cond_2
    :goto_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 4

    .line 131
    iget-object v0, p0, Ll/۬᩶ۡ;->֫:Ljava/lang/CharSequence;

    instance-of v1, v0, Ljava/lang/String;

    if-eqz v1, :cond_0

    .line 132
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0

    .line 135
    :cond_0
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result v0

    const/4 v1, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v1, v0, :cond_1

    mul-int/lit8 v2, v2, 0x1f

    .line 137
    iget-object v3, p0, Ll/۬᩶ۡ;->֫:Ljava/lang/CharSequence;

    invoke-interface {v3, v1}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v3

    add-int/2addr v2, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v2
.end method

.method public final ֫(Ljava/lang/StringBuilder;)V
    .locals 0

    .line 117
    iput-object p1, p0, Ll/۬᩶ۡ;->֫:Ljava/lang/CharSequence;

    return-void
.end method
