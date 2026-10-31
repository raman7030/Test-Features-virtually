.class public final Ll/۬᩷ۚ;
.super Ll/֨۬֡;
.source "15ZI"

# interfaces
.implements Ll/ܰ᩷ۚ;


# instance fields
.field public final ᩸:Ljava/util/Set;

.field public final ᩹:Ll/᩻ۡۚ;


# direct methods
.method public constructor <init>(Ll/᩻ۡۚ;Ll/ۛ۬ܺ;)V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 101
    iput-object p1, p0, Ll/۬᩷ۚ;->᩹:Ll/᩻ۡۚ;

    .line 102
    iput-object p2, p0, Ll/۬᩷ۚ;->᩸:Ljava/util/Set;

    return-void
.end method


# virtual methods
.method public final getElements()Ljava/util/Set;
    .locals 1

    .line 114
    iget-object v0, p0, Ll/۬᩷ۚ;->᩸:Ljava/util/Set;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 108
    iget-object v0, p0, Ll/۬᩷ۚ;->᩹:Ll/᩻ۡۚ;

    .line 51
    iget-object v0, v0, Ll/᩻ۡۚ;->᩹:Ll/۟ۢۚ;

    iget-object v0, v0, Ll/۟ۢۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method
