.class public final Ll/۫ᩴ֫;
.super Ljava/lang/Object;
.source "78PS"


# instance fields
.field public final ֫:Z

.field public final ۜ:Ljava/util/UUID;

.field public final ۧ:Ll/ܳ۬ܺ;

.field public final ܳ:Z

.field public final ܽ:[B

.field public final ܿ:Landroid/net/Uri;

.field public final ᩳ:Ll/ۢ۬ܺ;

.field public final ᩻:Z


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

    .line 949
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x6

    .line 950
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    const/4 v0, 0x7

    .line 951
    invoke-static {v0}, Ll/ۘ֨֫;->᩻(I)V

    return-void
.end method

.method public constructor <init>(Ll/۬ᩴ֫;)V
    .locals 1

    .line 879
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 880
    invoke-static {p1}, Ll/۬ᩴ֫;->֫(Ll/۬ᩴ֫;)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Ll/۬ᩴ֫;->ܿ(Ll/۬ᩴ֫;)Landroid/net/Uri;

    move-result-object v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :cond_1
    :goto_0
    const/4 v0, 0x1

    :goto_1
    invoke-static {v0}, Ll/᩺֡֫;->ۧ(Z)V

    .line 881
    invoke-static {p1}, Ll/۬ᩴ֫;->ۜ(Ll/۬ᩴ֫;)Ljava/util/UUID;

    move-result-object v0

    .line 155
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 881
    iput-object v0, p0, Ll/۫ᩴ֫;->ۜ:Ljava/util/UUID;

    .line 883
    invoke-static {p1}, Ll/۬ᩴ֫;->ܿ(Ll/۬ᩴ֫;)Landroid/net/Uri;

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩴ֫;->ܿ:Landroid/net/Uri;

    .line 884
    invoke-static {p1}, Ll/۬ᩴ֫;->ᩳ(Ll/۬ᩴ֫;)Ll/ۢ۬ܺ;

    .line 885
    invoke-static {p1}, Ll/۬ᩴ֫;->ᩳ(Ll/۬ᩴ֫;)Ll/ۢ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    .line 886
    invoke-static {p1}, Ll/۬ᩴ֫;->ܳ(Ll/۬ᩴ֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۫ᩴ֫;->ܳ:Z

    .line 887
    invoke-static {p1}, Ll/۬ᩴ֫;->֫(Ll/۬ᩴ֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۫ᩴ֫;->֫:Z

    .line 888
    invoke-static {p1}, Ll/۬ᩴ֫;->᩻(Ll/۬ᩴ֫;)Z

    move-result v0

    iput-boolean v0, p0, Ll/۫ᩴ֫;->᩻:Z

    .line 889
    invoke-static {p1}, Ll/۬ᩴ֫;->ۧ(Ll/۬ᩴ֫;)Ll/ܳ۬ܺ;

    .line 890
    invoke-static {p1}, Ll/۬ᩴ֫;->ۧ(Ll/۬ᩴ֫;)Ll/ܳ۬ܺ;

    move-result-object v0

    iput-object v0, p0, Ll/۫ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    .line 892
    invoke-static {p1}, Ll/۬ᩴ֫;->ܽ(Ll/۬ᩴ֫;)[B

    move-result-object v0

    if-eqz v0, :cond_2

    .line 893
    invoke-static {p1}, Ll/۬ᩴ֫;->ܽ(Ll/۬ᩴ֫;)[B

    move-result-object v0

    invoke-static {p1}, Ll/۬ᩴ֫;->ܽ(Ll/۬ᩴ֫;)[B

    move-result-object p1

    array-length p1, p1

    invoke-static {v0, p1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object p1

    goto :goto_2

    :cond_2
    const/4 p1, 0x0

    .line 894
    :goto_2
    iput-object p1, p0, Ll/۫ᩴ֫;->ܽ:[B

    return-void
.end method

.method public static bridge synthetic ֫(Ll/۫ᩴ֫;)[B
    .locals 0

    .line 0
    iget-object p0, p0, Ll/۫ᩴ֫;->ܽ:[B

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    .line 913
    :cond_0
    instance-of v1, p1, Ll/۫ᩴ֫;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    .line 917
    :cond_1
    check-cast p1, Ll/۫ᩴ֫;

    .line 918
    iget-object v1, p0, Ll/۫ᩴ֫;->ۜ:Ljava/util/UUID;

    iget-object v3, p1, Ll/۫ᩴ֫;->ۜ:Ljava/util/UUID;

    invoke-virtual {v1, v3}, Ljava/util/UUID;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/۫ᩴ֫;->ܿ:Landroid/net/Uri;

    iget-object v3, p1, Ll/۫ᩴ֫;->ܿ:Landroid/net/Uri;

    .line 919
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/۫ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    iget-object v3, p1, Ll/۫ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    .line 920
    invoke-static {v1, v3}, Ll/ۧ۫ᩴ;->equals(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-boolean v1, p0, Ll/۫ᩴ֫;->ܳ:Z

    iget-boolean v3, p1, Ll/۫ᩴ֫;->ܳ:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/۫ᩴ֫;->֫:Z

    iget-boolean v3, p1, Ll/۫ᩴ֫;->֫:Z

    if-ne v1, v3, :cond_2

    iget-boolean v1, p0, Ll/۫ᩴ֫;->᩻:Z

    iget-boolean v3, p1, Ll/۫ᩴ֫;->᩻:Z

    if-ne v1, v3, :cond_2

    iget-object v1, p0, Ll/۫ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    iget-object v3, p1, Ll/۫ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    .line 924
    invoke-virtual {v1, v3}, Ll/ܳ۬ܺ;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    iget-object v1, p0, Ll/۫ᩴ֫;->ܽ:[B

    iget-object p1, p1, Ll/۫ᩴ֫;->ܽ:[B

    .line 925
    invoke-static {v1, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    if-eqz p1, :cond_2

    return v0

    :cond_2
    return v2
.end method

.method public final hashCode()I
    .locals 2

    .line 930
    iget-object v0, p0, Ll/۫ᩴ֫;->ۜ:Ljava/util/UUID;

    invoke-virtual {v0}, Ljava/util/UUID;->hashCode()I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    .line 931
    iget-object v1, p0, Ll/۫ᩴ֫;->ܿ:Landroid/net/Uri;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Landroid/net/Uri;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 932
    iget-object v1, p0, Ll/۫ᩴ֫;->ᩳ:Ll/ۢ۬ܺ;

    invoke-virtual {v1}, Ll/ۢ۬ܺ;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 933
    iget-boolean v0, p0, Ll/۫ᩴ֫;->ܳ:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 934
    iget-boolean v0, p0, Ll/۫ᩴ֫;->֫:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 935
    iget-boolean v0, p0, Ll/۫ᩴ֫;->᩻:Z

    add-int/2addr v1, v0

    mul-int/lit8 v1, v1, 0x1f

    .line 936
    iget-object v0, p0, Ll/۫ᩴ֫;->ۧ:Ll/ܳ۬ܺ;

    invoke-virtual {v0}, Ll/ܳ۬ܺ;->hashCode()I

    move-result v0

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    .line 937
    iget-object v1, p0, Ll/۫ᩴ֫;->ܽ:[B

    invoke-static {v1}, Ljava/util/Arrays;->hashCode([B)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final ֫()[B
    .locals 2

    .line 900
    iget-object v0, p0, Ll/۫ᩴ֫;->ܽ:[B

    if-eqz v0, :cond_0

    array-length v1, v0

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method
