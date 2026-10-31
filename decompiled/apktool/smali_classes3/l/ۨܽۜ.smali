.class public final Ll/ۨܽۜ;
.super Ljava/lang/Object;
.source "G7AI"


# instance fields
.field public final ֫:Ljava/util/ArrayList;

.field public final ۧ:I

.field public ܳ:I

.field public final ܽ:I

.field public ܿ:I

.field public final ᩳ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 1

    .line 1194
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1187
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Ll/ۨܽۜ;->֫:Ljava/util/ArrayList;

    .line 1195
    iput-object p1, p0, Ll/ۨܽۜ;->ᩳ:Ljava/lang/String;

    .line 1196
    iput p2, p0, Ll/ۨܽۜ;->ܽ:I

    .line 1197
    iput p3, p0, Ll/ۨܽۜ;->ۧ:I

    return-void
.end method
