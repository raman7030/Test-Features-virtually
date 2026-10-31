.class public final Ll/᩻ᩳܿ;
.super Ljava/lang/Object;
.source "DAOV"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final ᩸:Ljava/util/ArrayList;

.field public final ᩹:Ljava/util/HashSet;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/᩻ᩳܿ;->᩸:Ljava/util/ArrayList;

    .line 16
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Ll/᩻ᩳܿ;->᩹:Ljava/util/HashSet;

    return-void
.end method


# virtual methods
.method public final clear()V
    .locals 1

    .line 29
    iget-object v0, p0, Ll/᩻ᩳܿ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 30
    iget-object v0, p0, Ll/᩻ᩳܿ;->᩹:Ljava/util/HashSet;

    invoke-virtual {v0}, Ljava/util/HashSet;->clear()V

    return-void
.end method

.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 40
    iget-object v0, p0, Ll/᩻ᩳܿ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method

.method public final sort(Ljava/util/Comparator;)V
    .locals 1

    .line 34
    iget-object v0, p0, Ll/᩻ᩳܿ;->᩸:Ljava/util/ArrayList;

    invoke-static {v0, p1}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    return-void
.end method

.method public final ֫(Landroid/text/SpannableString;)V
    .locals 2

    .line 19
    iget-object v0, p0, Ll/᩻ᩳܿ;->᩹:Ljava/util/HashSet;

    invoke-virtual {p1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    iget-object v0, p0, Ll/᩻ᩳܿ;->᩸:Ljava/util/ArrayList;

    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_0
    return-void
.end method
