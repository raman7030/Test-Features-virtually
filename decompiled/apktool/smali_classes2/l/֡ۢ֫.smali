.class public final Ll/֡ۢ֫;
.super Ljava/lang/Object;
.source "D5S8"


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field public final ֫:I

.field public final ۧ:Ljava/lang/reflect/Method;


# direct methods
.method public constructor <init>(Ljava/lang/reflect/Method;I)V
    .locals 0

    .line 211
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 212
    iput p2, p0, Ll/֡ۢ֫;->֫:I

    .line 213
    iput-object p1, p0, Ll/֡ۢ֫;->ۧ:Ljava/lang/reflect/Method;

    const/4 p2, 0x1

    .line 214
    invoke-virtual {p1, p2}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 243
    :cond_0
    instance-of v1, p1, Ll/֡ۢ֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 247
    :cond_1
    check-cast p1, Ll/֡ۢ֫;

    .line 248
    iget v1, p0, Ll/֡ۢ֫;->֫:I

    iget v3, p1, Ll/֡ۢ֫;->֫:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/֡ۢ֫;->ۧ:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    iget-object p1, p1, Ll/֡ۢ֫;->ۧ:Ljava/lang/reflect/Method;

    invoke-virtual {p1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 253
    iget v0, p0, Ll/֡ۢ֫;->֫:I

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Ll/֡ۢ֫;->ۧ:Ljava/lang/reflect/Method;

    invoke-virtual {v1}, Ljava/lang/reflect/Method;->getName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method
