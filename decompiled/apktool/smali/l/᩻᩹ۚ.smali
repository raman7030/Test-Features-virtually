.class public final Ll/᩻᩹ۚ;
.super Ll/᩷᩹ۚ;
.source "4BJX"


# instance fields
.field public final ֫:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    .line 46
    invoke-direct {p0}, Ll/᩷᩹ۚ;-><init>()V

    .line 47
    iput-object p1, p0, Ll/᩻᩹ۚ;->֫:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final toString()Ljava/lang/String;
    .locals 2

    .line 57
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    iget-object v1, p0, Ll/᩻᩹ۚ;->֫:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final ֫(Ll/᩶֡ۚ;Ll/᩶֡ۚ;)Z
    .locals 0

    .line 52
    invoke-virtual {p2}, Ll/᩶֡ۚ;->ᩳ֫()Ljava/lang/String;

    move-result-object p1

    iget-object p2, p0, Ll/᩻᩹ۚ;->֫:Ljava/lang/String;

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method
