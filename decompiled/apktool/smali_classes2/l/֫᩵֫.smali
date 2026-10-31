.class public Ll/֫᩵֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public final ֫:Ljava/lang/String;

.field public final ۧ:Ljava/lang/String;

.field public final ܳ:I

.field public final ܽ:Ljava/lang/String;

.field public final ܿ:I

.field public final ᩳ:Ljava/lang/String;

.field public final ᩻:Landroid/net/Uri;


# direct methods
.method public static constructor <clinit>()V
    .locals 5

    const/4 v0, 0x3

    const/4 v1, 0x4

    const/4 v2, 0x0

    const/4 v3, 0x1

    const/4 v4, 0x2

    .line 0
    invoke-static {v2, v3, v4, v0, v1}, Ll/ۚ۬ۚ;->֫(IIIII)V

    const/4 v0, 0x5

    .line 1743
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x6

    .line 1744
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/۟ᩴ֫;)V
    .locals 1

    .line 1691
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1692
    invoke-static {p1}, Ll/۟ᩴ֫;->᩻(Ll/۟ᩴ֫;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    .line 1693
    invoke-static {p1}, Ll/۟ᩴ֫;->ᩳ(Ll/۟ᩴ֫;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    .line 1694
    invoke-static {p1}, Ll/۟ᩴ֫;->ܽ(Ll/۟ᩴ֫;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    .line 1695
    invoke-static {p1}, Ll/۟ᩴ֫;->ܳ(Ll/۟ᩴ֫;)I

    move-result v0

    iput v0, p0, Ll/֫᩵֫;->ܳ:I

    .line 1696
    invoke-static {p1}, Ll/۟ᩴ֫;->ܿ(Ll/۟ᩴ֫;)I

    move-result v0

    iput v0, p0, Ll/֫᩵֫;->ܿ:I

    .line 1697
    invoke-static {p1}, Ll/۟ᩴ֫;->ۧ(Ll/۟ᩴ֫;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    .line 1698
    invoke-static {p1}, Ll/۟ᩴ֫;->֫(Ll/۟ᩴ֫;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Ll/֫᩵֫;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 1711
    :cond_0
    instance-of v1, p1, Ll/֫᩵֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 1715
    :cond_1
    check-cast p1, Ll/֫᩵֫;

    .line 1717
    iget-object v1, p0, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    iget-object v3, p1, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    invoke-virtual {v1, v3}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    .line 1718
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    .line 1719
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget v1, p0, Ll/֫᩵֫;->ܳ:I

    iget v3, p1, Ll/֫᩵֫;->ܳ:I

    if-ne v1, v3, :cond_2

    iget v1, p0, Ll/֫᩵֫;->ܿ:I

    iget v3, p1, Ll/֫᩵֫;->ܿ:I

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    iget-object v3, p1, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    .line 1722
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/֫᩵֫;->֫:Ljava/lang/String;

    iget-object p1, p1, Ll/֫᩵֫;->֫:Ljava/lang/String;

    .line 1723
    invoke-static {v1, p1}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 3

    .line 1728
    iget-object v0, p0, Ll/֫᩵֫;->᩻:Landroid/net/Uri;

    invoke-virtual {v0}, Landroid/net/Uri;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    const/4 v1, 0x0

    .line 1729
    iget-object v2, p0, Ll/֫᩵֫;->ᩳ:Ljava/lang/String;

    if-nez v2, :cond_0

    const/4 v2, 0x0

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1730
    iget-object v2, p0, Ll/֫᩵֫;->ܽ:Ljava/lang/String;

    if-nez v2, :cond_1

    const/4 v2, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1731
    iget v2, p0, Ll/֫᩵֫;->ܳ:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1732
    iget v2, p0, Ll/֫᩵֫;->ܿ:I

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1733
    iget-object v2, p0, Ll/֫᩵֫;->ۧ:Ljava/lang/String;

    if-nez v2, :cond_2

    const/4 v2, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    .line 1734
    iget-object v2, p0, Ll/֫᩵֫;->֫:Ljava/lang/String;

    if-nez v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_3
    add-int/2addr v0, v1

    return v0
.end method
