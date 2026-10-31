.class public final synthetic Ll/ۙ۫;
.super Ljava/lang/Object;
.source "SB10"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic ᩸:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 0
    iput p1, p0, Ll/ۙ۫;->᩸:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 2
    iget v0, p0, Ll/ۙ۫;->᩸:I

    packed-switch v0, :pswitch_data_0

    .line 7
    check-cast p1, Landroid/content/pm/PackageInfo;

    .line 9
    check-cast p2, Landroid/content/pm/PackageInfo;

    .line 1087
    iget-object v0, p1, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v0, v0, 0x81

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-nez v0, :cond_3

    const/4 v0, 0x1

    goto :goto_2

    .line 0
    :pswitch_0
    check-cast p1, [B

    check-cast p2, [B

    .line 195
    array-length v0, p1

    array-length v1, p2

    if-eq v0, v1, :cond_0

    .line 196
    array-length p1, p1

    array-length p2, p2

    sub-int/2addr p1, p2

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    .line 198
    :goto_0
    array-length v1, p1

    if-ge v0, v1, :cond_2

    .line 199
    aget-byte v1, p1, v0

    aget-byte v2, p2, v0

    if-eq v1, v2, :cond_1

    sub-int p1, v1, v2

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x0

    :goto_1
    return p1

    :cond_3
    const/4 v0, 0x0

    .line 1089
    :goto_2
    iget-object v3, p2, Landroid/content/pm/PackageInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget v3, v3, Landroid/content/pm/ApplicationInfo;->flags:I

    and-int/lit16 v3, v3, 0x81

    if-nez v3, :cond_4

    const/4 v1, 0x1

    :cond_4
    if-ne v0, v1, :cond_5

    .line 1092
    iget-object p1, p1, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    iget-object p2, p2, Landroid/content/pm/PackageInfo;->packageName:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v2

    goto :goto_3

    :cond_5
    if-eqz v0, :cond_6

    const/4 v2, -0x1

    :cond_6
    :goto_3
    return v2

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
