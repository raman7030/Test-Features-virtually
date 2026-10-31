.class public final Ll/᩵۟֡;
.super Ll/᩷۬֡;
.source "E61U"


# instance fields
.field public final synthetic ᩶:Ljava/lang/String;

.field public final synthetic ᩸:Ljava/util/Set;

.field public final synthetic ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 83
    iput-object p3, p0, Ll/᩵۟֡;->᩸:Ljava/util/Set;

    iput-object p1, p0, Ll/᩵۟֡;->᩹:Ljava/lang/String;

    iput-object p2, p0, Ll/᩵۟֡;->᩶:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/᩵۟֡;->᩸:Ljava/util/Set;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 93
    iget-object v0, p0, Ll/᩵۟֡;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 99
    iget-object v0, p0, Ll/᩵۟֡;->᩶:Ljava/lang/String;

    return-object v0
.end method
