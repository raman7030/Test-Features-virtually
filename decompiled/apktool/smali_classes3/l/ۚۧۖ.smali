.class public final Ll/ۚۧۖ;
.super Ll/ۙۖ۠;
.source "W7Q5"


# instance fields
.field public final ۙ:Ljava/util/HashMap;


# direct methods
.method public constructor <init>(Ll/ۘۘ۠;[CI)V
    .locals 0

    .line 159
    invoke-direct {p0, p1, p2, p3}, Ll/ۙۖ۠;-><init>(Ll/ۘۘ۠;[CI)V

    .line 156
    new-instance p1, Ljava/util/HashMap;

    invoke-direct {p1}, Ljava/util/HashMap;-><init>()V

    iput-object p1, p0, Ll/ۚۧۖ;->ۙ:Ljava/util/HashMap;

    return-void
.end method


# virtual methods
.method public final ֫(IILl/֡ۘ۠;)Ll/ۚۘ۠;
    .locals 3

    .line 177
    invoke-virtual {p0, p1, p2}, Ll/۫ۘ۠;->֫(II)[C

    move-result-object v0

    .line 169
    invoke-super {p0, p1, p2, p3}, Ll/ۙۖ۠;->֫(IILl/֡ۘ۠;)Ll/ۚۘ۠;

    move-result-object p3

    .line 170
    new-instance v1, Ll/֨ۧۖ;

    new-instance v2, Ljava/lang/String;

    invoke-direct {v2, v0}, Ljava/lang/String;-><init>([C)V

    invoke-direct {v1, p1, p2, v2}, Ll/֨ۧۖ;-><init>(IILjava/lang/String;)V

    .line 172
    iget-object p1, p0, Ll/ۚۧۖ;->ۙ:Ljava/util/HashMap;

    invoke-virtual {p1, p3, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p3
.end method

.method public final ᩴ()Ljava/util/HashMap;
    .locals 1

    .line 163
    iget-object v0, p0, Ll/ۚۧۖ;->ۙ:Ljava/util/HashMap;

    return-object v0
.end method
