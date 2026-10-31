.class public final Ll/ܺᩴ۠;
.super Ljava/lang/Object;
.source "640U"

# interfaces
.implements Ljava/lang/Iterable;


# instance fields
.field public final synthetic ᩶:Ll/֨ᩴ۠;

.field public ᩸:Ljava/util/ArrayList;

.field public ᩹:Ljava/util/Iterator;


# direct methods
.method public constructor <init>(Ll/֨ᩴ۠;Ljava/util/Iterator;)V
    .locals 0

    .line 872
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܺᩴ۠;->᩶:Ll/֨ᩴ۠;

    .line 873
    iput-object p2, p0, Ll/ܺᩴ۠;->᩹:Ljava/util/Iterator;

    .line 874
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Ll/ܺᩴ۠;->᩸:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 869
    new-instance v0, Ll/ۡᩴ۠;

    invoke-direct {v0, p0, p0}, Ll/ۡᩴ۠;-><init>(Ll/ܺᩴ۠;Ll/ܺᩴ۠;)V

    return-object v0
.end method
