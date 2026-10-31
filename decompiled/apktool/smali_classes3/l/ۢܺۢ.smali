.class public final Ll/ۢܺۢ;
.super Ljava/lang/Object;
.source "F1PL"

# interfaces
.implements Landroid/os/Parcelable;


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;


# instance fields
.field public final ۗ:Ljava/lang/String;

.field public final ۙ:Ljava/lang/String;

.field public final ᩶:Ljava/lang/String;

.field public final ᩸:Ljava/lang/String;

.field public final ᩹:Ll/ۧܺۢ;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 245
    new-instance v0, Ll/᩷ܺۢ;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    sput-object v0, Ll/ۢܺۢ;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .locals 1

    .line 257
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 258
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢܺۢ;->ۙ:Ljava/lang/String;

    .line 259
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢܺۢ;->᩸:Ljava/lang/String;

    .line 260
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢܺۢ;->᩶:Ljava/lang/String;

    .line 261
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ll/ۧ۫ᩴ;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object v0, p0, Ll/ۢܺۢ;->ۗ:Ljava/lang/String;

    .line 262
    new-instance v0, Ll/ۧܺۢ;

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    .line 166
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 167
    invoke-virtual {v0, p1}, Ll/ۧܺۢ;->֫(Ljava/lang/String;)V

    .line 262
    iput-object v0, p0, Ll/ۢܺۢ;->᩹:Ll/ۧܺۢ;

    return-void
.end method

.method public constructor <init>(Ll/ܽܺۢ;)V
    .locals 1

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    iget-object v0, p1, Ll/ܽܺۢ;->ۤ:Ljava/lang/String;

    iput-object v0, p0, Ll/ۢܺۢ;->ۙ:Ljava/lang/String;

    .line 239
    iget-object v0, p1, Ll/ܽܺۢ;->᩸:Ljava/lang/String;

    iput-object v0, p0, Ll/ۢܺۢ;->᩸:Ljava/lang/String;

    .line 240
    iget-object v0, p1, Ll/ܽܺۢ;->۬:Ljava/lang/String;

    iput-object v0, p0, Ll/ۢܺۢ;->᩶:Ljava/lang/String;

    .line 241
    iget-object v0, p1, Ll/ܽܺۢ;->᩺:Ljava/lang/String;

    iput-object v0, p0, Ll/ۢܺۢ;->ۗ:Ljava/lang/String;

    .line 242
    iget-object p1, p1, Ll/ܽܺۢ;->᩹:Ll/ۧܺۢ;

    iput-object p1, p0, Ll/ۢܺۢ;->᩹:Ll/ۧܺۢ;

    return-void
.end method


# virtual methods
.method public final describeContents()I
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 272
    iget-object p2, p0, Ll/ۢܺۢ;->ۙ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 273
    iget-object p2, p0, Ll/ۢܺۢ;->᩸:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 274
    iget-object p2, p0, Ll/ۢܺۢ;->᩶:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 275
    iget-object p2, p0, Ll/ۢܺۢ;->ۗ:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 276
    iget-object p2, p0, Ll/ۢܺۢ;->᩹:Ll/ۧܺۢ;

    invoke-virtual {p2}, Ll/ۧܺۢ;->֫()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method
