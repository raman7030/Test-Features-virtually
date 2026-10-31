.class public final Ll/ۘ۫;
.super Ljava/lang/Object;
.source "S3QK"


# static fields
.field public static final ۧ:Ll/ۘ۫;


# instance fields
.field public final ֫:Ll/᩵۫;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/util/Locale;

    .line 36
    invoke-static {v0}, Ll/ۘ۫;->֫([Ljava/util/Locale;)Ll/ۘ۫;

    move-result-object v0

    sput-object v0, Ll/ۘ۫;->ۧ:Ll/ۘ۫;

    return-void
.end method

.method public constructor <init>(Ll/᩵۫;)V
    .locals 0

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 41
    iput-object p1, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    return-void
.end method

.method public static ֫(Landroid/os/LocaleList;)Ll/ۘ۫;
    .locals 2

    .line 57
    new-instance v0, Ll/ۘ۫;

    new-instance v1, Ll/֡۫;

    invoke-direct {v1, p0}, Ll/֡۫;-><init>(Ljava/lang/Object;)V

    invoke-direct {v0, v1}, Ll/ۘ۫;-><init>(Ll/᩵۫;)V

    return-object v0
.end method

.method public static ֫(Ljava/lang/String;)Ll/ۘ۫;
    .locals 4

    if-eqz p0, :cond_2

    .line 161
    invoke-virtual {p0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    const-string v0, ","

    const/4 v1, -0x1

    .line 164
    invoke-virtual {p0, v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p0

    .line 165
    array-length v0, p0

    new-array v1, v0, [Ljava/util/Locale;

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_1

    .line 168
    aget-object v3, p0, v2

    invoke-static {v3}, Ll/ܺ۫;->֫(Ljava/lang/String;)Ljava/util/Locale;

    move-result-object v3

    .line 169
    aput-object v3, v1, v2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    .line 171
    :cond_1
    invoke-static {v1}, Ll/ۘ۫;->֫([Ljava/util/Locale;)Ll/ۘ۫;

    move-result-object p0

    return-object p0

    .line 148
    :cond_2
    :goto_1
    sget-object p0, Ll/ۘ۫;->ۧ:Ll/ۘ۫;

    return-object p0
.end method

.method public static varargs ֫([Ljava/util/Locale;)Ll/ۘ۫;
    .locals 2

    .line 75
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x18

    if-lt v0, v1, :cond_0

    .line 76
    invoke-static {p0}, Ll/ۖ۫;->֫([Ljava/util/Locale;)Landroid/os/LocaleList;

    move-result-object p0

    invoke-static {p0}, Ll/ۘ۫;->֫(Landroid/os/LocaleList;)Ll/ۘ۫;

    move-result-object p0

    return-object p0

    .line 78
    :cond_0
    new-instance v0, Ll/ۘ۫;

    new-instance v1, Ll/ᩴ۫;

    invoke-direct {v1, p0}, Ll/ᩴ۫;-><init>([Ljava/util/Locale;)V

    invoke-direct {v0, v1}, Ll/ۘ۫;-><init>(Ll/᩵۫;)V

    return-object v0
.end method

.method public static ܿ()Ll/ۘ۫;
    .locals 1

    .line 148
    sget-object v0, Ll/ۘ۫;->ۧ:Ll/ۘ۫;

    return-object v0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 1

    .line 317
    instance-of v0, p1, Ll/ۘ۫;

    if-eqz v0, :cond_0

    check-cast p1, Ll/ۘ۫;

    iget-object p1, p1, Ll/ۘ۫;->֫:Ll/᩵۫;

    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final hashCode()I
    .locals 1

    .line 322
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 1

    .line 328
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(I)Ljava/util/Locale;
    .locals 1

    .line 89
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-interface {v0, p1}, Ll/᩵۫;->get(I)Ljava/util/Locale;

    move-result-object p1

    return-object p1
.end method

.method public final ֫()Z
    .locals 1

    .line 99
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-interface {v0}, Ll/᩵۫;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final ۧ()I
    .locals 1

    .line 107
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-interface {v0}, Ll/᩵۫;->size()I

    move-result v0

    return v0
.end method

.method public final ܽ()Ljava/lang/String;
    .locals 1

    .line 128
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-interface {v0}, Ll/᩵۫;->֫()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/Object;
    .locals 1

    .line 67
    iget-object v0, p0, Ll/ۘ۫;->֫:Ll/᩵۫;

    invoke-interface {v0}, Ll/᩵۫;->ۧ()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
