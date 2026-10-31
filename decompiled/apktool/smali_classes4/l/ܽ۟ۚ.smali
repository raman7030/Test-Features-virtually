.class public final synthetic Ll/ܽ۟ۚ;
.super Ljava/lang/Object;
.source "43ZG"

# interfaces
.implements Ljava/util/function/Supplier;


# instance fields
.field public final synthetic ᩶:J

.field public final synthetic ᩸:Ll/ۜ۟ۚ;

.field public final synthetic ᩹:J


# direct methods
.method public synthetic constructor <init>(Ll/ۜ۟ۚ;JJ)V
    .locals 0

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ll/ܽ۟ۚ;->᩸:Ll/ۜ۟ۚ;

    iput-wide p2, p0, Ll/ܽ۟ۚ;->᩹:J

    iput-wide p4, p0, Ll/ܽ۟ۚ;->᩶:J

    return-void
.end method


# virtual methods
.method public final get()Ljava/lang/Object;
    .locals 5

    .line 930
    iget-object v0, p0, Ll/ܽ۟ۚ;->᩸:Ll/ۜ۟ۚ;

    iget v0, v0, Ll/ۜ۟ۚ;->ܿ:I

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    iget-wide v1, p0, Ll/ܽ۟ۚ;->᩹:J

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    iget-wide v2, p0, Ll/ܽ۟ۚ;->᩶:J

    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    const/4 v3, 0x3

    new-array v3, v3, [Ljava/lang/Object;

    const/4 v4, 0x0

    aput-object v0, v3, v4

    const/4 v0, 0x1

    aput-object v1, v3, v0

    const/4 v0, 0x2

    aput-object v2, v3, v0

    const-string v0, "Funny char with code=\'%c\' at %d:%d"

    .line 19
    invoke-static {v0, v3}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
