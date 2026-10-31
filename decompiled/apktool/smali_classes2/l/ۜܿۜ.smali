.class public final Ll/ۜܿۜ;
.super Ljava/lang/Object;
.source "L78E"


# instance fields
.field public ֫:Ljava/lang/String;

.field public ۧ:Ljava/util/BitSet;


# virtual methods
.method public final ֫(Ll/ܿ᩺᩻;)Ljava/util/BitSet;
    .locals 1

    .line 1859
    iget v0, p1, Ll/ܿ᩺᩻;->֫:I

    if-gez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    .line 1862
    :cond_0
    iget-object p1, p1, Ll/ܿ᩺᩻;->ܽ:Ljava/lang/String;

    .line 1863
    iget-object v0, p0, Ll/ۜܿۜ;->ۧ:Ljava/util/BitSet;

    if-eqz v0, :cond_2

    iget-object v0, p0, Ll/ۜܿۜ;->֫:Ljava/lang/String;

    if-eq p1, v0, :cond_1

    if-eqz p1, :cond_2

    .line 1864
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1865
    :cond_1
    iget-object p1, p0, Ll/ۜܿۜ;->ۧ:Ljava/util/BitSet;

    return-object p1

    .line 1867
    :cond_2
    iput-object p1, p0, Ll/ۜܿۜ;->֫:Ljava/lang/String;

    .line 1868
    new-instance p1, Ljava/util/BitSet;

    invoke-direct {p1}, Ljava/util/BitSet;-><init>()V

    iput-object p1, p0, Ll/ۜܿۜ;->ۧ:Ljava/util/BitSet;

    return-object p1
.end method
