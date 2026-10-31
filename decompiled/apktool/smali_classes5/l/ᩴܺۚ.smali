.class public final Ll/ᩴܺۚ;
.super Ll/᩷۬֡;
.source "857H"

# interfaces
.implements Ll/ᩴ᩵ۚ;


# static fields
.field public static final ۗ:Ljava/util/Comparator;


# instance fields
.field public final ۙ:Ljava/lang/String;

.field public final ᩶:I

.field public ᩸:Ll/ۛ۬ܺ;

.field public ᩹:Ljava/lang/String;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 47
    new-instance v0, Ll/ۘܺۚ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ᩴܺۚ;->ۗ:Ljava/util/Comparator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 62
    iput p1, p0, Ll/ᩴܺۚ;->᩶:I

    .line 63
    iput-object p2, p0, Ll/ᩴܺۚ;->ۙ:Ljava/lang/String;

    .line 64
    invoke-static {}, Ll/ۛ۬ܺ;->of()Ll/ۛ۬ܺ;

    move-result-object p1

    iput-object p1, p0, Ll/ᩴܺۚ;->᩸:Ll/ۛ۬ܺ;

    return-void
.end method


# virtual methods
.method public final getAnnotations()Ljava/util/Set;
    .locals 1

    .line 81
    iget-object v0, p0, Ll/ᩴܺۚ;->᩸:Ll/ۛ۬ܺ;

    return-object v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    .line 87
    iget-object v0, p0, Ll/ᩴܺۚ;->᩹:Ljava/lang/String;

    return-object v0
.end method

.method public final getSignature()Ljava/lang/String;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Ll/ᩴܺۚ;->ۙ:Ljava/lang/String;

    return-object v0
.end method

.method public final ֫()I
    .locals 1

    .line 69
    iget v0, p0, Ll/ᩴܺۚ;->᩶:I

    return v0
.end method
