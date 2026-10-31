.class public final Ll/᩸ܿᩳ;
.super Ll/֫ۛۡ;
.source "I9S1"


# instance fields
.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0, p3}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 47
    iput-object p1, p0, Ll/᩸ܿᩳ;->᩹:Ljava/lang/String;

    .line 48
    iput-object p2, p0, Ll/᩸ܿᩳ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 62
    iget-object v0, p0, Ll/᩸ܿᩳ;->᩸:Ljava/lang/String;

    return-object v0
.end method

.method public final ۧ()Ljava/lang/String;
    .locals 1

    .line 55
    iget-object v0, p0, Ll/᩸ܿᩳ;->᩹:Ljava/lang/String;

    return-object v0
.end method
