.class public final Ll/ۤ᩵ۧ;
.super Ljava/lang/Object;
.source "E8SE"


# instance fields
.field public final ֫:Ljava/util/Set;

.field public final ۧ:Ljava/lang/String;

.field public final ܽ:I

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V
    .locals 0

    .line 943
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 944
    iput p2, p0, Ll/ۤ᩵ۧ;->ܽ:I

    .line 945
    iput-object p1, p0, Ll/ۤ᩵ۧ;->ۧ:Ljava/lang/String;

    .line 946
    iput-object p3, p0, Ll/ۤ᩵ۧ;->ᩳ:Ljava/lang/String;

    .line 947
    iput-object p4, p0, Ll/ۤ᩵ۧ;->֫:Ljava/util/Set;

    return-void
.end method

.method public static ֫()Ll/ۤ᩵ۧ;
    .locals 4

    .line 971
    new-instance v0, Ll/ۤ᩵ۧ;

    const/4 v1, 0x0

    .line 975
    sget-object v2, Ljava/util/Collections;->EMPTY_SET:Ljava/util/Set;

    const-string v3, ""

    invoke-direct {v0, v3, v1, v3, v2}, Ll/ۤ᩵ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V

    return-object v0
.end method

.method public static ֫(ILjava/lang/String;)Ll/ۤ᩵ۧ;
    .locals 5

    .line 951
    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1

    .line 952
    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/2addr v0, v1

    invoke-static {v0}, Ll/᩺֡֫;->֫(Z)V

    const-string v0, " "

    .line 953
    invoke-virtual {p1, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v0

    const/4 v2, 0x0

    const/4 v3, -0x1

    if-ne v0, v3, :cond_0

    const-string v0, ""

    goto :goto_0

    .line 958
    :cond_0
    invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v4

    .line 959
    invoke-virtual {p1, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object p1

    move-object v0, v4

    .line 961
    :goto_0
    sget-object v4, Ll/ۘ֨֫;->ᩳ:Ljava/lang/String;

    const-string v4, "\\."

    .line 1090
    invoke-virtual {p1, v4, v3}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    move-result-object p1

    .line 962
    aget-object v2, p1, v2

    .line 963
    new-instance v3, Ljava/util/HashSet;

    invoke-direct {v3}, Ljava/util/HashSet;-><init>()V

    .line 964
    :goto_1
    array-length v4, p1

    if-ge v1, v4, :cond_1

    .line 965
    aget-object v4, p1, v1

    invoke-virtual {v3, v4}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    .line 967
    :cond_1
    new-instance p1, Ll/ۤ᩵ۧ;

    invoke-direct {p1, v2, p0, v0, v3}, Ll/ۤ᩵ۧ;-><init>(Ljava/lang/String;ILjava/lang/String;Ljava/util/Set;)V

    return-object p1
.end method
