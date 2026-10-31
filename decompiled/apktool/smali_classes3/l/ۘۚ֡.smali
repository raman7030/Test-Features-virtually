.class public final Ll/ۘۚ֡;
.super Ll/ۨ֡֡;
.source "P90Y"


# instance fields
.field public ۜ:Ljava/lang/String;

.field public ᩷:Ljava/lang/String;

.field public ᩻:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Ll/ۨ֡֡;-><init>()V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 23
    invoke-direct {p0}, Ll/ۨ֡֡;-><init>()V

    .line 24
    iput-object p1, p0, Ll/ۘۚ֡;->ۜ:Ljava/lang/String;

    .line 25
    iput-object p2, p0, Ll/ۘۚ֡;->᩻:Ljava/lang/String;

    .line 26
    iput-object p3, p0, Ll/ۘۚ֡;->᩷:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫(Ll/ۤۚ֡;)V
    .locals 0

    .line 55
    invoke-interface {p1, p0}, Ll/ۤۚ֡;->֫(Ll/ۘۚ֡;)V

    return-void
.end method

.method public final ۡ()Ljava/lang/String;
    .locals 1

    .line 46
    iget-object v0, p0, Ll/ۘۚ֡;->᩷:Ljava/lang/String;

    return-object v0
.end method

.method public final ۢ()Ljava/lang/String;
    .locals 1

    .line 30
    iget-object v0, p0, Ll/ۘۚ֡;->ۜ:Ljava/lang/String;

    return-object v0
.end method

.method public final ᩷()Ljava/lang/String;
    .locals 1

    .line 38
    iget-object v0, p0, Ll/ۘۚ֡;->᩻:Ljava/lang/String;

    return-object v0
.end method
