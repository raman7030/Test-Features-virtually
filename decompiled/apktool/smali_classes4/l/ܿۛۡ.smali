.class public final Ll/ܿۛۡ;
.super Ljava/lang/Object;
.source "J1PQ"


# instance fields
.field public ֫:Ljava/util/ArrayList;

.field public ۧ:Ljava/util/ArrayList;

.field public ܽ:Ljava/lang/String;

.field public ܿ:Ljava/lang/String;

.field public ᩳ:Ll/ܿۛۡ;


# direct methods
.method public constructor <init>(Ll/ܿۛۡ;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 141
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 138
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿۛۡ;->֫:Ljava/util/ArrayList;

    .line 139
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ܿۛۡ;->ۧ:Ljava/util/ArrayList;

    .line 142
    iput-object p1, p0, Ll/ܿۛۡ;->ᩳ:Ll/ܿۛۡ;

    .line 143
    iput-object p2, p0, Ll/ܿۛۡ;->ܽ:Ljava/lang/String;

    .line 144
    iput-object p3, p0, Ll/ܿۛۡ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public static synthetic ֫(Ljava/util/Comparator;Ll/ܿۛۡ;Ll/ܿۛۡ;)I
    .locals 0

    .line 223
    iget-object p1, p1, Ll/ܿۛۡ;->ܽ:Ljava/lang/String;

    iget-object p2, p2, Ll/ܿۛۡ;->ܽ:Ljava/lang/String;

    invoke-interface {p0, p1, p2}, Ljava/util/Comparator;->compare(Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static bridge synthetic ֫(Ll/ܿۛۡ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛۡ;->֫:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ֫(Ll/ܿۛۡ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿۛۡ;->ܽ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ֫(Ll/ܿۛۡ;Ll/ܿۛۡ;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿۛۡ;->ᩳ:Ll/ܿۛۡ;

    return-void
.end method

.method public static bridge synthetic ۧ(Ll/ܿۛۡ;)Ljava/util/ArrayList;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛۡ;->ۧ:Ljava/util/ArrayList;

    return-object p0
.end method

.method public static bridge synthetic ۧ(Ll/ܿۛۡ;Ljava/lang/String;)V
    .locals 0

    .line 0
    iput-object p1, p0, Ll/ܿۛۡ;->ܿ:Ljava/lang/String;

    return-void
.end method

.method public static bridge synthetic ܽ(Ll/ܿۛۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛۡ;->ܽ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ܿ(Ll/ܿۛۡ;)Ljava/lang/String;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛۡ;->ܿ:Ljava/lang/String;

    return-object p0
.end method

.method public static bridge synthetic ᩳ(Ll/ܿۛۡ;)Ll/ܿۛۡ;
    .locals 0

    .line 0
    iget-object p0, p0, Ll/ܿۛۡ;->ᩳ:Ll/ܿۛۡ;

    return-object p0
.end method


# virtual methods
.method public final ֫()Ljava/util/List;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ܿۛۡ;->֫:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ljava/lang/String;)Ll/ۧۛۡ;
    .locals 3

    .line 180
    iget-object v0, p0, Ll/ܿۛۡ;->ۧ:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll/ۧۛۡ;

    .line 181
    invoke-static {v1}, Ll/ۧۛۡ;->֫(Ll/ۧۛۡ;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final ֫(Ljava/util/Comparator;)V
    .locals 4

    .line 223
    new-instance v0, Ll/ܽۛۡ;

    invoke-direct {v0, p1}, Ll/ܽۛۡ;-><init>(Ljava/util/Comparator;)V

    iget-object v1, p0, Ll/ܿۛۡ;->֫:Ljava/util/ArrayList;

    invoke-static {v1, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 224
    new-instance v0, Ll/ᩳۛۡ;

    invoke-direct {v0, p1}, Ll/ᩳۛۡ;-><init>(Ljava/util/Comparator;)V

    iget-object v2, p0, Ll/ܿۛۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v2, v0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 225
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v0, :cond_0

    .line 226
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll/ܿۛۡ;

    .line 227
    invoke-virtual {v3, p1}, Ll/ܿۛۡ;->֫(Ljava/util/Comparator;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final ۧ()Ljava/util/List;
    .locals 1

    .line 167
    iget-object v0, p0, Ll/ܿۛۡ;->ۧ:Ljava/util/ArrayList;

    invoke-static {v0}, Ll/᩶۬ᩴ;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method public final ܽ()Ljava/util/ArrayList;
    .locals 1

    .line 171
    iget-object v0, p0, Ll/ܿۛۡ;->֫:Ljava/util/ArrayList;

    return-object v0
.end method

.method public final ܿ()Ljava/lang/String;
    .locals 1

    .line 155
    iget-object v0, p0, Ll/ܿۛۡ;->ܿ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩳ()Ljava/lang/String;
    .locals 1

    .line 148
    iget-object v0, p0, Ll/ܿۛۡ;->ܽ:Ljava/lang/String;

    return-object v0
.end method
