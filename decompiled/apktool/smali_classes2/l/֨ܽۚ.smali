.class public final Ll/֨ܽۚ;
.super Ljava/lang/Exception;
.source "64HJ"


# instance fields
.field public final ᩸:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 1

    const-string v0, "Invalid reference"

    .line 50
    invoke-direct {p0, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 51
    iput-object p1, p0, Ll/֨ܽۚ;->᩸:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/Throwable;)V
    .locals 0

    .line 65
    invoke-direct {p0, p2}, Ljava/lang/Exception;-><init>(Ljava/lang/Throwable;)V

    .line 66
    iput-object p1, p0, Ll/֨ܽۚ;->᩸:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final ֫()Ljava/lang/String;
    .locals 1

    .line 77
    iget-object v0, p0, Ll/֨ܽۚ;->᩸:Ljava/lang/String;

    return-object v0
.end method
