.class public final Ll/ۧ۬;
.super Ljava/lang/Object;
.source "R1B7"


# static fields
.field public static final ܿ:Ll/ۧ۬;


# instance fields
.field public final ֫:I

.field public final ۧ:I

.field public final ܽ:I

.field public final ᩳ:I


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 37
    new-instance v0, Ll/ۧ۬;

    const/4 v1, 0x0

    invoke-direct {v0, v1, v1, v1, v1}, Ll/ۧ۬;-><init>(IIII)V

    sput-object v0, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    return-void
.end method

.method public constructor <init>(IIII)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 45
    iput p1, p0, Ll/ۧ۬;->ۧ:I

    .line 46
    iput p2, p0, Ll/ۧ۬;->ᩳ:I

    .line 47
    iput p3, p0, Ll/ۧ۬;->ܽ:I

    .line 48
    iput p4, p0, Ll/ۧ۬;->֫:I

    return-void
.end method

.method public static ֫(IIII)Ll/ۧ۬;
    .locals 1

    if-nez p0, :cond_0

    if-nez p1, :cond_0

    if-nez p2, :cond_0

    if-nez p3, :cond_0

    .line 65
    sget-object p0, Ll/ۧ۬;->ܿ:Ll/ۧ۬;

    return-object p0

    .line 67
    :cond_0
    new-instance v0, Ll/ۧ۬;

    invoke-direct {v0, p0, p1, p2, p3}, Ll/ۧ۬;-><init>(IIII)V

    return-object v0
.end method

.method public static ֫(Landroid/graphics/Insets;)Ll/ۧ۬;
    .locals 3

    .line 191
    invoke-static {p0}, Ll/۠ۢ֡;->֫(Landroid/graphics/Insets;)I

    move-result v0

    invoke-static {p0}, Ll/ۙ᩵ᩴ;->֫(Landroid/graphics/Insets;)I

    move-result v1

    invoke-static {p0}, Ll/۫ۤ᩷;->֫(Landroid/graphics/Insets;)I

    move-result v2

    invoke-static {p0}, Ll/ܺ۫᩷;->֫(Landroid/graphics/Insets;)I

    move-result p0

    invoke-static {v0, v1, v2, p0}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object p0

    return-object p0
.end method

.method public static ֫(Ll/ۧ۬;Ll/ۧ۬;)Ll/ۧ۬;
    .locals 4

    .line 116
    iget v0, p0, Ll/ۧ۬;->ۧ:I

    iget v1, p1, Ll/ۧ۬;->ۧ:I

    invoke-static {v0, v1}, Ljava/lang/Math;->max(II)I

    move-result v0

    iget v1, p0, Ll/ۧ۬;->ᩳ:I

    iget v2, p1, Ll/ۧ۬;->ᩳ:I

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    iget v2, p0, Ll/ۧ۬;->ܽ:I

    iget v3, p1, Ll/ۧ۬;->ܽ:I

    .line 117
    invoke-static {v2, v3}, Ljava/lang/Math;->max(II)I

    move-result v2

    iget p0, p0, Ll/ۧ۬;->֫:I

    iget p1, p1, Ll/ۧ۬;->֫:I

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    .line 116
    invoke-static {v0, v1, v2, p0}, Ll/ۧ۬;->֫(IIII)Ll/ۧ۬;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    const/4 v1, 0x0

    if-eqz p1, :cond_6

    .line 145
    const-class v2, Ll/ۧ۬;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v3

    if-eq v2, v3, :cond_1

    goto :goto_0

    .line 147
    :cond_1
    check-cast p1, Ll/ۧ۬;

    .line 149
    iget v2, p0, Ll/ۧ۬;->֫:I

    iget v3, p1, Ll/ۧ۬;->֫:I

    if-eq v2, v3, :cond_2

    return v1

    .line 150
    :cond_2
    iget v2, p0, Ll/ۧ۬;->ۧ:I

    iget v3, p1, Ll/ۧ۬;->ۧ:I

    if-eq v2, v3, :cond_3

    return v1

    .line 151
    :cond_3
    iget v2, p0, Ll/ۧ۬;->ܽ:I

    iget v3, p1, Ll/ۧ۬;->ܽ:I

    if-eq v2, v3, :cond_4

    return v1

    .line 152
    :cond_4
    iget v2, p0, Ll/ۧ۬;->ᩳ:I

    iget p1, p1, Ll/ۧ۬;->ᩳ:I

    if-eq v2, p1, :cond_5

    return v1

    :cond_5
    return v0

    :cond_6
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 2

    .line 160
    iget v0, p0, Ll/ۧ۬;->ۧ:I

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Ll/ۧ۬;->ᩳ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 161
    iget v1, p0, Ll/ۧ۬;->ܽ:I

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 162
    iget v1, p0, Ll/ۧ۬;->֫:I

    add-int/2addr v0, v1

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 169
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Insets{left="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Ll/ۧ۬;->ۧ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", top="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۧ۬;->ᩳ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", right="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۧ۬;->ܽ:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", bottom="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Ll/ۧ۬;->֫:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫()Landroid/graphics/Insets;
    .locals 4

    .line 201
    iget v0, p0, Ll/ۧ۬;->ܽ:I

    iget v1, p0, Ll/ۧ۬;->֫:I

    iget v2, p0, Ll/ۧ۬;->ۧ:I

    iget v3, p0, Ll/ۧ۬;->ᩳ:I

    invoke-static {v2, v3, v0, v1}, Ll/֫۬;->֫(IIII)Landroid/graphics/Insets;

    move-result-object v0

    return-object v0
.end method
