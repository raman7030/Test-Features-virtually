.class public Ll/۟ۧ۠;
.super Ljava/lang/Object;
.source "A451"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:[Ll/۟ۧ۠;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;[Ll/۟ۧ۠;)V
    .locals 0

    .line 4750
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4751
    iput-object p1, p0, Ll/۟ۧ۠;->֫:Ljava/lang/String;

    .line 4752
    iput-object p2, p0, Ll/۟ۧ۠;->ۧ:[Ll/۟ۧ۠;

    return-void
.end method


# virtual methods
.method public ֫(Ljava/lang/Object;)Z
    .locals 5

    .line 4760
    check-cast p1, Ll/ܽܶ۠;

    .line 4761
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object v0

    .line 4762
    invoke-virtual {p1}, Ll/ܽܶ۠;->ۧ()Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Ll/۟ۧ۠;->֫:Ljava/lang/String;

    invoke-virtual {v1, v2}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    iget-object v1, p0, Ll/۟ۧ۠;->ۧ:[Ll/۟ۧ۠;

    array-length v3, v1

    .line 4763
    invoke-virtual {p1}, Ll/ܽܶ۠;->ܽ()[Ljava/lang/Object;

    move-result-object p1

    array-length p1, p1

    if-eq v3, p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    .line 4766
    :goto_0
    array-length v3, v0

    if-ge p1, v3, :cond_2

    .line 4767
    aget-object v3, v1, p1

    aget-object v4, v0, p1

    invoke-virtual {v3, v4}, Ll/۟ۧ۠;->֫(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1

    return v2

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p1, 0x1

    return p1

    :cond_3
    :goto_1
    return v2
.end method
