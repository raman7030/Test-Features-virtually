.class public final Ll/ܳ᩺֫;
.super Ljava/lang/Object;
.source "27NH"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:I

.field public final ܳ:Ljava/lang/String;

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:Ljava/lang/String;

.field public final ᩳ:I


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 83
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 84
    iput p1, p0, Ll/ܳ᩺֫;->ۧ:I

    .line 85
    iput p2, p0, Ll/ܳ᩺֫;->ᩳ:I

    .line 86
    iput-object p3, p0, Ll/ܳ᩺֫;->ܳ:Ljava/lang/String;

    .line 87
    iput-object p4, p0, Ll/ܳ᩺֫;->֫:Ljava/lang/String;

    .line 88
    iput-object p5, p0, Ll/ܳ᩺֫;->ܿ:Ljava/lang/String;

    .line 89
    iput-object p6, p0, Ll/ܳ᩺֫;->ܽ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_2

    .line 97
    const-class v2, Ll/ܳ᩺֫;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 100
    :cond_1
    check-cast p1, Ll/ܳ᩺֫;

    .line 101
    iget v2, p0, Ll/ܳ᩺֫;->ۧ:I

    iget v3, p1, Ll/ܳ᩺֫;->ۧ:I

    if-ne v2, v3, :cond_2

    iget v2, p0, Ll/ܳ᩺֫;->ᩳ:I

    iget v3, p1, Ll/ܳ᩺֫;->ᩳ:I

    if-ne v2, v3, :cond_2

    iget-object v2, p0, Ll/ܳ᩺֫;->ܳ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳ᩺֫;->ܳ:Ljava/lang/String;

    .line 103
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܳ᩺֫;->֫:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳ᩺֫;->֫:Ljava/lang/String;

    .line 104
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܳ᩺֫;->ܿ:Ljava/lang/String;

    iget-object v3, p1, Ll/ܳ᩺֫;->ܿ:Ljava/lang/String;

    .line 105
    invoke-static {v2, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    iget-object v2, p0, Ll/ܳ᩺֫;->ܽ:Ljava/lang/String;

    iget-object p1, p1, Ll/ܳ᩺֫;->ܽ:Ljava/lang/String;

    .line 106
    invoke-static {v2, p1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 3

    .line 112
    iget v0, p0, Ll/ܳ᩺֫;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ܳ᩺֫;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    .line 113
    iget-object v2, p0, Ll/ܳ᩺֫;->ܳ:Ljava/lang/String;

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 114
    iget-object v2, p0, Ll/ܳ᩺֫;->֫:Ljava/lang/String;

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_1

    :cond_1
    const/4 v2, 0x0

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 115
    iget-object v2, p0, Ll/ܳ᩺֫;->ܿ:Ljava/lang/String;

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 116
    iget-object v2, p0, Ll/ܳ᩺֫;->ܽ:Ljava/lang/String;

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :cond_3
    add-int/2addr v0, v1

    return v0
.end method
