.class public final Ll/۟ۧ֫;
.super Ljava/lang/Object;
.source "RB4Y"


# static fields
.field public static final ܳ:Ljava/lang/ThreadLocal;


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:Ll/ۤۧ֫;

.field public final ܽ:Ll/ۗ᩵;

.field public ܿ:Ll/ܰۧ֫;

.field public ᩳ:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 69
    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, Ll/۟ۧ֫;->ܳ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    .line 40
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    new-instance v0, Ll/ۗ᩵;

    invoke-direct {v0}, Ll/ۗ᩵;-><init>()V

    iput-object v0, p0, Ll/۟ۧ֫;->ܽ:Ll/ۗ᩵;

    .line 77
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/۟ۧ֫;->֫:Ljava/util/ArrayList;

    .line 79
    new-instance v0, Ll/ۤۧ֫;

    invoke-direct {v0, p0}, Ll/ۤۧ֫;-><init>(Ll/۟ۧ֫;)V

    iput-object v0, p0, Ll/۟ۧ֫;->ۧ:Ll/ۤۧ֫;

    const/4 v0, 0x0

    .line 85
    iput-boolean v0, p0, Ll/۟ۧ֫;->ᩳ:Z

    return-void
.end method


# virtual methods
.method public final ֫()Ll/ۨۧ֫;
    .locals 2

    .line 111
    iget-object v0, p0, Ll/۟ۧ֫;->ܿ:Ll/ܰۧ֫;

    if-nez v0, :cond_0

    .line 113
    new-instance v0, Ll/ܰۧ֫;

    iget-object v1, p0, Ll/۟ۧ֫;->ۧ:Ll/ۤۧ֫;

    invoke-direct {v0, v1}, Ll/ܰۧ֫;-><init>(Ll/ۤۧ֫;)V

    iput-object v0, p0, Ll/۟ۧ֫;->ܿ:Ll/ܰۧ֫;

    .line 118
    :cond_0
    iget-object v0, p0, Ll/۟ۧ֫;->ܿ:Ll/ܰۧ֫;

    return-object v0
.end method

.method public final ֫(J)V
    .locals 9

    .line 151
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    const/4 v2, 0x0

    const/4 v3, 0x0

    .line 152
    :goto_0
    iget-object v4, p0, Ll/۟ۧ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result v5

    if-ge v3, v5, :cond_3

    .line 153
    invoke-virtual {v4, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ll/ۛۧ֫;

    if-nez v4, :cond_0

    goto :goto_2

    :cond_0
    const/4 v5, 0x0

    .line 369
    iget-object v6, p0, Ll/۟ۧ֫;->ܽ:Ll/ۗ᩵;

    invoke-virtual {v6, v4, v5}, Ll/ۗ᩵;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    .line 171
    check-cast v5, Ljava/lang/Long;

    if-nez v5, :cond_1

    goto :goto_1

    .line 175
    :cond_1
    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v7

    cmp-long v5, v7, v0

    if-gez v5, :cond_2

    .line 176
    invoke-virtual {v6, v4}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    :goto_1
    invoke-interface {v4, p1, p2}, Ll/ۛۧ֫;->֫(J)Z

    :cond_2
    :goto_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    .line 183
    :cond_3
    iget-boolean p1, p0, Ll/۟ۧ֫;->ᩳ:Z

    if-eqz p1, :cond_6

    .line 184
    invoke-virtual {v4}, Ljava/util/ArrayList;->size()I

    move-result p1

    :cond_4
    :goto_3
    add-int/lit8 p1, p1, -0x1

    if-ltz p1, :cond_5

    .line 185
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p2

    if-nez p2, :cond_4

    .line 186
    invoke-virtual {v4, p1}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    goto :goto_3

    .line 189
    :cond_5
    iput-boolean v2, p0, Ll/۟ۧ֫;->ᩳ:Z

    :cond_6
    return-void
.end method

.method public final ֫(Ll/֨ܽ֫;)V
    .locals 2

    .line 141
    iget-object v0, p0, Ll/۟ۧ֫;->ܽ:Ll/ۗ᩵;

    invoke-virtual {v0, p1}, Ll/ۗ᩵;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 142
    iget-object v0, p0, Ll/۟ۧ֫;->֫:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    move-result p1

    if-ltz p1, :cond_0

    const/4 v1, 0x0

    .line 144
    invoke-virtual {v0, p1, v1}, Ljava/util/ArrayList;->set(ILjava/lang/Object;)Ljava/lang/Object;

    const/4 p1, 0x1

    .line 145
    iput-boolean p1, p0, Ll/۟ۧ֫;->ᩳ:Z

    :cond_0
    return-void
.end method
