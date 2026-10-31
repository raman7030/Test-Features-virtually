.class public final Ll/᩶ۡᩳ;
.super Ll/ۗۡᩳ;
.source "N1X5"


# instance fields
.field public final synthetic ᩸:[Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;[Ljava/lang/String;)V
    .locals 0

    .line 594
    iput-object p2, p0, Ll/᩶ۡᩳ;->᩸:[Ljava/lang/String;

    .line 6
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final printStackTrace(Ljava/io/PrintWriter;)V
    .locals 2

    .line 597
    iget-object v0, p0, Ll/᩶ۡᩳ;->᩸:[Ljava/lang/String;

    const/4 v1, 0x1

    aget-object v0, v0, v1

    invoke-virtual {p1, v0}, Ljava/io/PrintWriter;->print(Ljava/lang/String;)V

    return-void
.end method
